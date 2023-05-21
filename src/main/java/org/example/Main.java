package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fzk, trk, kim, mzk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100) {
        } else {
            System.out.println("Geçersiz not!");
            mat=0;
        }
        System.out.print("Fizik notunuz:");
        fzk = inp.nextInt();
        if (fzk >= 0 && fzk <= 100) {
        } else {
            System.out.println("Geçersiz not!");
            fzk=0;
        }
        System.out.print("Türkçe notunuz:");
        trk = inp.nextInt();
        if (trk >= 0 && trk <= 100) {
        } else {
            System.out.println("Geçersiz not!");
            trk=0;
        }
        System.out.print("Kimya notunuz:");
        kim = inp.nextInt();
        if (kim >= 0 && kim <= 100) {
        } else {
            System.out.println("Geçersiz not!");
            kim=0;
        }
        System.out.print("Müzik notunuz:");
        mzk = inp.nextInt();
        if (mzk >= 0 && mzk <= 100) {
        } else {
            System.out.println("Geçersiz not!");
            mzk=0;
        }

        double ort = (mat + fzk + kim + trk + mzk) / 5;
        if (ort < 55) {
            System.out.println("Kaldın By!");
        } else {
            System.out.println("Geçtiniz Tebrikler");
        }

        System.out.println("Ortalamanız  :" + ort);
    }
}