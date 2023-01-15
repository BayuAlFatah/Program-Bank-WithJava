package bank1.Bank;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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
            //percabangan pertama untuk memilih user input
            if (input == 1){
                System.out.println("Masukkan Nominal Anda : ");
                input = inputUser.nextInt();
                b1.Setor(input);
            } else if (input == 2) {
                //untuk menampilkan Pilihan Transaki
                System.out.println("Silahkan Pilih Transaksi");
                System.out.println("1. Untuk Info Akun anda");
                System.out.println("2. untuk Setor ");
                System.out.println("3. Untuk CheckSaldo");
                System.out.println("4. untuk Bayar ");
                System.out.println("5. Untuk Transfer");
                System.out.println("6. Untuk Tarik Tunai");
                System.out.println("Silahkan Pilih angka : ");
                //untuk memilih menu transaksi
                var milihinput = inputUser.nextInt();
                if (milihinput == 1) {
                    b1.getInfo();
                } else if (milihinput == 2) {
                    System.out.println("masukkan Nominal anda : ");
                    input= inputUser.nextInt();
                    b1.Setor(input);
                } else if (milihinput == 3) {
                    b1.checkSaldo();
                } else if (milihinput == 4) {
                    System.out.println("masukkan Nominal anda : ");
                    var setor = inputUser.nextInt();
                    b1.bayar(setor);
                } else if (milihinput == 5) {
                    System.out.println("masukkan Nominal anda : ");
                    var setor = inputUser.nextInt();
                    b1.Transfer(b2, setor);
                } else if (milihinput == 6) {
                    System.out.println("masukkan Nominal anda : ");
                    input = inputUser.nextInt();
                    b1.Tarik(input);
                } else
                    System.out.println("Silahkan pilih angka dengan Benar ");
            } else {
                System.out.println("Angka Tidak Ditemukan ");
                System.out.println("silahkan masukkan angka dengan benar");
            }


        }while (input != 3);
        System.out.println("Terima Kasih Telah menggunakan Bank Bayu");


    }
}
