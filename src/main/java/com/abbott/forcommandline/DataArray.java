package com.abbott.forcommandline;
import com.abbott.data.DataProgram;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class DataArray {
    public void readDataFromWebsite(List<String> list) {
        Document document = parseDataFromSite();
        if (document != null) {
            Elements elements = document.select(DataProgram.CSS_SELECTOR);
            elements.stream().map(Element::text).forEach(list::add);
        }
    }

    private Document parseDataFromSite() {
        try {
            return Jsoup.connect(DataProgram.URL_WEB_SITE).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private List<String> dataArray() {
        DataArray dataArray = new DataArray();
        List<String> websiteData = new ArrayList<>();
        dataArray.readDataFromWebsite(websiteData);
        return websiteData;
    }

    public static void main(String[] args) {
        DataArray dataArray = new DataArray();
        dataArray.dataArray().forEach(System.out::println);
    }
}