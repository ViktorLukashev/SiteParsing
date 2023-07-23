package com.abbott.forexel;

import com.abbott.data.DataProgram;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.stream.Collectors;

/**
 * Получение данных с вебсайта
 */
class GetDataFromWebsite {

    // Подключение к URL и получение HTML-страницы
    protected Document parseDataFromSite() {
        try {
            return Jsoup.connect(DataProgram.URL_WEB_SITE).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // добавлено возвращаемое значение для случая ошибки
    }

    // Выполнение поиска нужного элемента
    protected String searchElement() {
        GetDataFromWebsite getDataSite = new GetDataFromWebsite();

        // Выполнение поиска нужных элементов
        Elements elements = getDataSite.parseDataFromSite().select(DataProgram.CSS_SELECTOR);

        // Перебор найденных элементов и извлечение данных
        return elements.stream().map(element -> element.text() + "\n")
                .collect(Collectors.joining()); // возвращение результата поиска
    }
}
