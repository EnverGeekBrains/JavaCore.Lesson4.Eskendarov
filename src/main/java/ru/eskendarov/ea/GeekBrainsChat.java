package ru.eskendarov.ea;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class GeekBrainsChat extends JFrame {

    private final JPanel chatPanel = new JPanel();
    private final JPanel sendPanel = new JPanel();
    private final JTextArea chatText = new JTextArea();
    private final JScrollPane scrollChatText = new JScrollPane(chatText);
    private final JButton send = new JButton("Send");
    private final JTextField message = new JTextField();
    private final JMenuBar menuBar = new JMenuBar();
    private final JMenu file = new JMenu("File");
    private final JMenuItem exit = new JMenuItem("Exit");
    private final JMenu edit = new JMenu("Edit");
    private final JMenuItem clear = new JMenuItem("Clear chat");


    GeekBrainsChat(String title) {
        setTitle(title);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        chatPanel.setBackground(new Color(0xFA98C0));
        chatPanel.setLayout(new BorderLayout());

        chatText.setLineWrap(true);
        chatText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        chatText.setBackground(chatPanel.getBackground());
        chatText.setEditable(false);
        chatText.setBackground(new Color(0xFFEAF3));

        scrollChatText.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollChatText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        chatPanel.add(scrollChatText);
        chatPanel.setBorder(new TitledBorder(null, "GeekBrains Chat",
                TitledBorder.CENTER, TitledBorder.TOP, new Font(Font.MONOSPACED, Font.BOLD, 18), null));

        message.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 15));
        sendPanel.setBackground(new Color(0xFFCCE1));
        sendPanel.setLayout(new BorderLayout());
        sendPanel.add(message, BorderLayout.CENTER);
        sendPanel.add(send, BorderLayout.EAST);
        sendPanel.setBorder(new TitledBorder(null, "",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.ABOVE_TOP, null, null));
        add(chatPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);
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
        menuBar.add(file);
        file.add(exit);
        exit.addActionListener(e -> {
            System.exit(0);
        });
        menuBar.add(edit);
        edit.add(clear);
        clear.addActionListener(e -> {
            chatText.setText("");
        });
//        Добавим меню в основное окошко
        add(menuBar, BorderLayout.NORTH);

    }
}
