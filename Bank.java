package bank1.Bank;

public class Bank {
    protected String Nama;
    private int Saldo = 10_000;
    protected int NoRek;

    Bank(String nama,int Norek){
        this.NoRek = Norek;
        this.Nama = nama;
    }
    protected void getInfo(){
        System.out.println("Your Name : " + Nama);
        System.out.println("Your Number : " + NoRek);
        System.out.println("Your Money : " + Saldo);
    }
    protected void checkSaldo(){
        System.out.println("your Money : " + Saldo);
    }
    void Setor(int jumlahSetor){
        System.out.println("setor sejumlah = " + jumlahSetor);
        System.out.println("Jumlah setelah ditambah = ");
        Saldo += jumlahSetor;
        System.out.println(Saldo);
    }
    void Tarik(int jumlahTarik) {
        System.out.println("tarik sejumlah " + jumlahTarik);
        System.out.println("Saldo setelah berkurang = " + (Saldo -= jumlahTarik));
    }
    protected void bayar(int money){
        System.out.println("Pembayaran sejumlah " + money);
        this.Saldo -= money;
    }
    void Transfer(Bank tujuan, int jumlah){
        this.Saldo -= jumlah;
        tujuan.Saldo += jumlah;
    }





}
