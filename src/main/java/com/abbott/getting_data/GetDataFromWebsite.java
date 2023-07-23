package com.abbott.getting_data;

import com.abbott.data.DataProgram;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetDataFromWebsite {
    // Подключение к URL и получение HTML-страницы
    public Document parseDataFromSite() {
        try {
            return Jsoup.connect(DataProgram.URL_WEB_SITE).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // добавлено возвращаемое значение для случая ошибки
    }
    // Считывание данных и запись данных в List с веб-сайта и отсеивание пустых строк
    public List<String> readDataFromWebsite() {
        Document document = null;
        try {
            document = parseDataFromSite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> websiteData = new ArrayList<>();
        if (document != null) {
            Elements elements = document.select(DataProgram.CSS_SELECTOR);
            elements.stream()
                    .map(Element::text)
                    .filter(text -> !text.isEmpty())
                    .forEach(websiteData::add);
        }
        return websiteData;
    }
    // Создание и сохранение данных в Exel из readDataFromWebsite()
    public void writeToExcel(List<String> data, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");
        int rowCount = 0;
        for (String value : data) {
            Row row = sheet.createRow(rowCount++);
            Cell cell = row.createCell(0);
            cell.setCellValue(value);
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}