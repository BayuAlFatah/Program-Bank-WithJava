package bank1.Bank;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

      System.out.println("nama = "+ b.Nama);
     System.out.println("CEK SALDO = " + b.Saldo);
 System.out.println("Nomor Rekening = " + b.NoRek);

 System.out.println("Saldo awal = " + b.Saldo);
       b.Setor(5000);
        b.Tarik(5000);


    }
}
