package com.abbott;


public class Main {
    public static void main(String[] args) {
        GetDataFromWebsite getDataSite = new GetDataFromWebsite();
        UpdateTimer timer = new UpdateTimer();
        String data = getDataSite.searchElement();
        timer.startFetchingData(data);

        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.writeDataToExcel(data);
    }
}