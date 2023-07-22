package com.abbott;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Timer;
import java.util.stream.Collectors;

/**
 * Получение данных с вебсайта
 */
public class GetDataFromWebsite {
    private Timer timer;

    // Подключение к URL и получение HTML-страницы
    public Document parseDataFromSite() {
        try {
            return Jsoup.connect(DataURL.URLWebSite).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // добавлено возвращаемое значение для случая ошибки
    }

    // Выполнение поиска нужного элемента
    public String searchElement() {
        GetDataFromWebsite getDataSite = new GetDataFromWebsite();

        // Выполнение поиска нужных элементов
        Elements elements = getDataSite.parseDataFromSite().select("div");

        // Перебор найденных элементов и извлечение данных
        return elements.stream().map(element -> element.text() + "\n").collect(Collectors.joining()); // возвращение результата поиска
    }


    public static void main(String[] args) {

    }
}