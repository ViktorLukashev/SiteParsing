package com.abbott.forcommandline;

import com.abbott.forcommandline.visual.Table;

public class ListShowVisual {
    public static void main(String[] args) {
        DataArray dataArray = new DataArray();
        dataArray.dataArray().forEach(System.out::println);

        // Данные для таблицы
        Object[][] data = {
                {"JohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohnJohn", "Doe", 30},
                {"Jane", "Smith", 25},
                {"Robert", "Johnson", 35}
        };
        Table table = new Table();
        table.setUp(data);
    }
}
