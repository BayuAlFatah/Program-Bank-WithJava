package bank1.Bank;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        var isbenar = true;
        int input;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan UserName anda : ");
        var nama = inputUser.next();
        System.out.println("Masukkan No Pin Anda : ");
        var pin = inputUser.nextInt();
        try{
            if (pin != 21441900){
                System.out.println("No Pin Salah Silahkan Masukkan No Pin Yang Benar");
                main(args);
            }
        }catch (Exception e){
            System.out.println("Silahkan Masukkan Pin dengan Benar ");
            main(args);
        }
        //instansiasi untuk memanggil class bank.java dengan construktor
        Bank b1 = new Bank(nama,pin);
        Bank b2 = new Bank("asep",21000);
        //doo while untuk mengulangi program
        do {
            System.out.println("\n");
            System.out.println("||----Selamat datang di Bank Bayu----||");
            System.out.println("||---Silahkan Pilih menu Transaksi---||");
            System.out.println("|| 1. Untuk Setor Tunai \t\t\t ||");
            System.out.println("|| 2. Untuk Transaksi Lainnya \t\t ||");
            System.out.println("|| 3. Untuk Keluar/Cancel \t\t\t  ||");
            System.out.println("||-----------------------------------||");
            System.out.println("Ketikkan angka untuk Menu Transaksi : ");
            //untuk memasukkan input angka untuk memilih menu transaksi
            input = inputUser.nextInt();


        }while (input != 3);
        System.out.println("Terima Kasih Telah menggunakan Bank Bayu");


    }
}
