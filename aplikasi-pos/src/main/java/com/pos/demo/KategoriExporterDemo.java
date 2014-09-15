/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.demo;

import com.pos.exporter.KategoriExporter;

/**
 *
 * @author ceisa-djbc
 */
public class KategoriExporterDemo {
    public static void main(String[] args) {
        String namaFile = "target/kategori.csv";
        KategoriExporter pe = new KategoriExporter();
        pe.exportKeCsv(namaFile);
    }
}
