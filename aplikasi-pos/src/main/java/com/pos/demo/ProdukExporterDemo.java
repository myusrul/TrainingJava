package com.pos.demo;

import com.pos.exporter.ProdukExporter;

public class ProdukExporterDemo {
    public static void main(String[] args) {
        String namaFile = "target/produk.csv";
        ProdukExporter pe = new ProdukExporter();
        pe.exportKeCsv(namaFile);
    }
}
