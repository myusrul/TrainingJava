/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.demo;

import com.pos.exporter.KantorCabangExporter;

/**
 *
 * @author CEISA-DJBC
 */
public class KantorCabangExporterDemo {
     public static void main(String[] args) {
        String namaFile = "target/kantorcabang.csv";
        KantorCabangExporter kce = new KantorCabangExporter();
        kce.exportKeCsv(namaFile);
    }
}
