package com.pos.demo;

import com.pos.domain.Customer;
import com.pos.domain.Produk;
import com.pos.importer.CustomerImporter;
import com.pos.importer.ProdukImporter;
import java.io.File;
import java.util.List;

public class CustomerImporterDemo {
    public static void main(String[] args) {
       File f = new File("src/main/resources/customer.csv");
        
        CustomerImporter ci = new CustomerImporter();
        
        List<Customer> hasil = ci.importFile(f);
        System.out.println("======== Hasil : "+hasil.size()+" records ===========");
        for (Customer customer : hasil) {
            System.out.println("ID : "+customer.getIdCsr());
            System.out.println("Kode Csr : "+customer.getKodeCsr());
            System.out.println("Nama Csr : "+customer.getNamaCsr());
            System.out.println("Alamat Csr : "+customer.getAlamatCsr());
            System.out.println("Tanggal : "+customer.getTanggalDaftar());
        } 
    }
    
}
