package bank1.Bank;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        var isbenar = true;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan UserName anda : ");
        var nama = inputUser.next();
        System.out.println("Masukkan No Pin Anda : ");
        var pin = inputUser.nextInt();
        try{
            if (pin != 214441900){
                System.out.println("No Pin Salah Silahkan Masukkan No Pin Yang Benar");
                main(args);
            }
        }catch (Exception e){
            System.out.println("Silahkan Masukkan Pin dengan Benar ");
            main(args);
        }


    }
}
