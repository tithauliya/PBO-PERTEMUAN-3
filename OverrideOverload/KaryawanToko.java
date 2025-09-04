/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverrideOverload;

/**
 *
 * @author HP
 */
// override
class KaryawanToko {

    void bekerja() {
        System.out.println("Karyawan toko sedang bekerja.");
    }
}

class Kasir extends KaryawanToko {

    void bekerja() {
        System.out.println("Kasir sedang melayani pembayaran.");
    }
}

class PembuatKue extends KaryawanToko {

    void bekerja() {
        System.out.println("Pembuat kue sedang membuat kue.");
    }
}
