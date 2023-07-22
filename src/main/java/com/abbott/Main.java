package com.abbott;

public class Main {
    public static void main(String[] args) {
        GetDataFromWebsite getDataSite = new GetDataFromWebsite();
        UpdateTimer timer = new UpdateTimer();
        timer.startFetchingData(getDataSite.searchElement());
    }
}