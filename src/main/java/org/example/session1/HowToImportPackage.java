package org.example.session1;

import org.example.session1.com.testing.vn.common.Helper;

public class HowToImportPackage {

    public static void main(String[] args) {
        double value = 99.5;
        String formatValue = Helper.getFormatDollar(value);
        System.out.println("Format value: " + formatValue);
    }
}
