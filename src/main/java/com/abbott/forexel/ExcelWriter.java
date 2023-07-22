package com.abbott.forexel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

class ExcelWriter {
    public void writeDataToExcel(String data) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        String[] lines = data.split("\n");
        for (int i = 0; i < lines.length; i++) {
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(lines[i]);
        }

        try (FileOutputStream outputStream = new FileOutputStream("src/main/resources/getText.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Данные записаны в Excel файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}