package Daspro7;

public class LatihanMandiriB {
    public static void main(String[] args) {
        int i = 1, hasil = 0;

        while (i <= 25) {
            hasil += i;
            i++; 
        }

        System.out.println("Hasil penjumlahan deret bilangan dari 25 sampai dengan 1 adalah: " + hasil);
    }
}