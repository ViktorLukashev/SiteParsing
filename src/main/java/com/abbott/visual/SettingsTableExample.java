package com.abbott.visual;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SettingsTableExample extends JFrame {

    public SettingsTableExample() {
        // Создаем массив строк для заполнения таблицы
        Object[][] data = {
                {"Setting 1", "Value 1", 5, "dfdfg"},
                {"Setting 2", "Value 2"},
                {"Setting 3", "Value 3"}
        };

        // Создаем массив с заголовками столбцов
        String[] columnNames = {"Настройка", "Значение", "ggg", "ddd"};

        // Создаем модель данных таблицы
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Создаем таблицу
        JTable table = new JTable(model);

        // Задаем ширину столбцов
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);

        // Задаем высоту строк
        table.setRowHeight(30);

        // Устанавливаем цвет фона для четных строк
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row % 2 == 0) {
                    component.setBackground(Color.LIGHT_GRAY);
                } else {
                    component.setBackground(Color.WHITE);
                }
                return component;
            }
        });

        // Создаем панель для размещения таблицы
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(table));

        // Создаем кнопку выхода и добавляем обработчик события
        JButton exitButton = new JButton("Выход");
        exitButton.addActionListener(e -> {
            System.exit(0); // Закрытие программы
        });

        // Добавляем кнопку выхода в нижнюю часть окна
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(exitButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SettingsTableExample::new);
    }
}