package com.pinuspintar.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PertemuanPertama {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/budi-family-1")
    public String sayBudiFamily() {
        return "Bapak Budi\nIbu Budi\nAnak Budi";
    }

    @GetMapping("/budi-family-2")
    public String sayBudiFamily1() {
        String x = "Bapak Budi\nIbu Budi\nAnak Budi";
        return x;
    }

    @GetMapping("/budi-family")
    public String sayBudi() {
        return "Hello Budi!" + "\n" +
                "Hello Bapack Budi" + "\n" +
                "Hello Ibuck Budi";
    }

    @GetMapping("/penjumlahan")
    public String perhitungan() {
        int a = 6;
        int b = 12;
        int c = a + b;
        return "Hasil penjumlahan: " + c;
    }

    @GetMapping("/pengurangan")
    public String pengurangan() {
        int a = 18;
        int b = 6;
        int c = a - b;
        return "Hasil pengurangan: " + c;
    }

    @GetMapping("/perkalian")
    public String perkalian() {
        int a = 3;
        int b = 4;
        int c = a * b;
        return "Hasil perkalian: " + c;
    }

    @GetMapping("/pembagian")
    public String pembagian() {
        int a = 36;
        int b = 3;
        int c = a / b;
        return "Hasil pembagian: " + c;
    }

    @GetMapping("/showroom")
    public String showroom() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        return "Mobil yang dipilih: " + cars[1];
    }

    @GetMapping("/perkenalan")
    public String abdi() {
        return "Nama: Muhammad Abdillah\nUsia : 18 tahun\nAsal: Semarang\nMotivasi: Bapakku Teknisi";
    }

    @GetMapping("/array")
    public int[] array() {
        int[] array = {1,2,3,4};
        return array;
    }

    @GetMapping("/angkaganjil")
    private int[] angkaganjil() {
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
        int[] hasil = {};
        for (int i = 0; i < angka.length; i++) {
            int i1 = angka[0];
        }
        return hasil;
    }

public class PassingGrade {
    public static void main(String[] args) {
        int nilai = 85;  // Ganti dengan nilai yang ingin diuji
        String grade;

        // Menggunakan pembagian 10 untuk membuat case yang lebih sederhana
        switch (nilai / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "E"; // Nilai di bawah 60
        }

        System.out.println("Nilai: " + nilai + ", Grade: " + grade);
    }

    }
}
