public class Driver {
    private String idDriver;
    private String nama;
    private int nomorHp;
    private int saldoIncome;

    public void setDriver(String idDriver, String nama, int nomorHp, int saldoIncome) {
        this.idDriver = idDriver;
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.saldoIncome = saldoIncome;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getNama() {
        return nama;
    }

    public int getNomorHp() {
        return nomorHp;
    }

    public int getSaldoIncome() {
        return saldoIncome;
    }

    public void konfirmasiOrder() {
        System.out.println("konfirmasi Driver " + nama);
    }

    public void withdrawSaldoIncome(int amount) {
        if (saldoIncome >= amount) {
            saldoIncome -= amount;
        } else {
            System.out.println("Insufficient income balance.");
        }
    }
}
