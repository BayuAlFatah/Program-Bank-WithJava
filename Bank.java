package bank1.Bank;

public class Bank {
    String Nama;
    int Saldo = 10_000;
    String NoRek;

    Bank(String nama,String Norek){
        this.NoRek = Norek;
        this.Nama = nama;
    }
    protected void getInfo(){
        System.out.println("Your Name : " + Nama);
        System.out.println("Your Number : " + NoRek);
        System.out.println("Your Money : " + Saldo);
    }
    void Transfer(Bank tujuan, int jumlah){
        this.Saldo -= jumlah;
        tujuan.Saldo += jumlah;
    }
    void Setor(int jumlahSetor){
        System.out.println("setor sejumlah = " + jumlahSetor);
        System.out.println("Jumlah setelah ditambah = ");
        Saldo += jumlahSetor;
        System.out.println(Saldo);
    }
    void Tarik(int jumlahTarik){
        System.out.println("tarik sejumlah " + jumlahTarik);
        System.out.println("Saldo setelah berkurang = " + (Saldo-=jumlahTarik));

//        int hasil = jumlah - Saldo;
//        System.out.println(hasil);
    }
    double saldo(){
        return Saldo ;
    }
    void  Inforekening(){
        System.out.println("Masukkan Tujuan = " );
    }




}
