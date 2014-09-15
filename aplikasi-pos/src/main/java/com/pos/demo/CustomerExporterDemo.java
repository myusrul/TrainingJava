package com.pos.demo;

import com.pos.exporter.CustomerExporter;

public class CustomerExporterDemo {
    public static void main(String[] args) {
        String namaFile = "target/customer.csv";
        CustomerExporter ce = new CustomerExporter();
        ce.exportKeCsv(namaFile);
    }
}
