package com.abbott.forcommandline;

import java.util.List;

import static javax.swing.JOptionPane.*;

public class ListShow {
    public static void main(String[] args) {
        DataArray dataArray = new DataArray();
        List<String> websiteData = dataArray.dataArray();
//        List<String> sublist = dataArray.getSublist(websiteData);
//        showMessageDialog(null, sublist, "Website Data", INFORMATION_MESSAGE);
    }
}
