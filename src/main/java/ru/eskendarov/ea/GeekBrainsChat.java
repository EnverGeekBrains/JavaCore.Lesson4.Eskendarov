package ru.eskendarov.ea;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class GeekBrainsChat {

    final JFrame frame;

    GeekBrainsChat(JFrame frame) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        this.frame = frame;
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel chatPanel = new JPanel();
        chatPanel.setBackground(new Color(0xFA98C0));
        chatPanel.setLayout(new BorderLayout());

        JTextArea chatText = new JTextArea();
        chatText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        chatText.setBackground(chatPanel.getBackground());
        chatText.setEditable(false);

        chatPanel.add(new JScrollPane(chatText));
        chatPanel.setBorder(new TitledBorder(null, "GeekBrains Chat",
                TitledBorder.CENTER, TitledBorder.TOP, new Font(Font.MONOSPACED, Font.BOLD, 18), Color.BLACK));

        JButton send = new JButton("Send");
        JTextField message = new JTextField();
        message.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 15));

        JPanel sendPanel = new JPanel();
        sendPanel.setBackground(new Color(0xFFCCE1));
        sendPanel.setLayout(new BorderLayout());
        sendPanel.add(message, BorderLayout.CENTER);
        sendPanel.add(send, BorderLayout.EAST);
        sendPanel.setBorder(new TitledBorder(null, "",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.ABOVE_TOP, null, null));

        frame.add(chatPanel, BorderLayout.CENTER);
        frame.add(sendPanel, BorderLayout.SOUTH);

//        Слушатели для для мыши и клавиши enter для перевода строки в окошко чата
        send.addActionListener(e -> {
            chatText.append(message.getText() + "\n");
            message.setText("");
        });
        message.addActionListener(e -> {
            chatText.append(message.getText() + "\n");
            message.setText("");
        });

//         Создадим меню для выхода из чата и для очистки окна чата
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        exit.addActionListener(e -> {
            System.exit(0);
        });

        JMenu edit = new JMenu("Edit");
        menuBar.add(edit);
        JMenuItem clear = new JMenuItem("Clear chat");
        edit.add(clear);
        clear.addActionListener(e -> {
            chatText.setText("");
        });

//        Добавим меню в основное окошко
        frame.add(menuBar, BorderLayout.NORTH);
    }
}