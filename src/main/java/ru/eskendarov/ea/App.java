package ru.eskendarov.ea;

import javax.swing.*;

/**
 * Домашнее задание
 * 1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
 * в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
 * сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
 * форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего
 * поля в центральное.
 */

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
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
            new GeekBrainsChat("JAVA_CORE GUI").setVisible(true);
        });
    }
}
