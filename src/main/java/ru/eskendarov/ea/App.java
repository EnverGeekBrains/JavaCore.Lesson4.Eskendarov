package ru.eskendarov.ea;

import javax.swing.*;

/**
 * Домашнее задание
 * 1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
 * в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
 * сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
 * форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего
 * поля в центральное.
 *
 */
public class App 
{
    public static void main(String[] args) {
        GeekBrainsChat chat =  new GeekBrainsChat(new JFrame("JAVA_CORE GUI"));
        chat.frame.setVisible(true);
    }
}
