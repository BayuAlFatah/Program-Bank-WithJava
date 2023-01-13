package bank1.Bank;

public class Bank {
    String Nama;
    int Saldo = 10_000;
    String NoRek;

//    public bank1.Bank(String Norek,String nama,int saldo){
//        this.NoRek = Norek;
//        this.Nama = nama;
//        this.Saldo = saldo;
//    }
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
