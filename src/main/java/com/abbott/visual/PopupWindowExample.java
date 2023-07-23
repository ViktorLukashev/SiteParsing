package com.abbott.visual;

import javax.swing.*;
import java.awt.*;

public class PopupWindowExample {
    private static final String WINDOW_FORMAT = "Window";
    private static final String EXCEL_FORMAT = "Excel";

    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame("Выберете реализацию");

        // Создание кнопок
        JButton windowButton = new JButton(WINDOW_FORMAT);
        JButton excelButton = new JButton(EXCEL_FORMAT);

        // Добавление обработчиков событий для кнопок
        windowButton.addActionListener(e -> {
            // Обработка нажатия кнопки "Window"
            JOptionPane.showMessageDialog(frame, "Вы выбрали окно", "Information", JOptionPane.INFORMATION_MESSAGE);
        });

        excelButton.addActionListener(e -> {
            // Обработка нажатия кнопки "Excel"
            JOptionPane.showMessageDialog(frame, "Вы выбрали Excel", "Information", JOptionPane.INFORMATION_MESSAGE);
        });

        // Добавление кнопок на окно
        frame.getContentPane().add(windowButton);
        frame.getContentPane().add(excelButton);

        // Настройка окна
        frame.setSize(600, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}