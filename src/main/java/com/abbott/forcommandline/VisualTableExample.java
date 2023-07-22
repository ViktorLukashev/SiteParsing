package com.abbott.forcommandline;
import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualTableExample {
    public static void main(String[] args) {
        // Данные для таблицы
        Object[][] data = {
                {"JohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohn", "Doe", 30},
                {"Jane", "Smith", 25},
                {"Robert", "Johnson", 35}
        };

        // Заголовки столбцов
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Создаем таблицу с данными и заголовками
        JTable table = new JTable(data, columnNames);

        // Создание панели и добавление таблицы на нее
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Создание кнопки "Выход"
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Добавление кнопки "Выход" вверху панели
        panel.add(exitButton, BorderLayout.SOUTH);

        // Создание фрейма и добавление панели на него
        JFrame frame = new JFrame("Visual Table Example");
        frame.getContentPane().add(panel);

        // Установка размеров фрейма и отображение его на экране
        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Получение объекта столбца для каждого столбца таблицы
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn firstNameColumn = columnModel.getColumn(0);
        TableColumn lastNameColumn = columnModel.getColumn(1);
        TableColumn ageColumn = columnModel.getColumn(2);

        // Установка предпочтительной ширины для каждого столбца
        firstNameColumn.setPreferredWidth(100);
        lastNameColumn.setPreferredWidth(100);
        ageColumn.setPreferredWidth(50);

        frame.setVisible(true);
    }
}