public class User {
    private String idUser;
    private String nama;
    private int nomorHp;
    private int saldoGopay;

    public void setUser(String idUser, String nama, int nomorHp, int saldoGopay) {
        this.idUser = idUser;
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.saldoGopay = saldoGopay;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getNama() {
        return nama;
    }

    public int getNomorHp() {
        return nomorHp;
    }

    public int getSaldoGopay() {
        return saldoGopay;
    }

    public void topupGopay(int amount) {
        saldoGopay += amount;
    }

    public void membuatOrder() {
        System.out.println("Order Dibuat atas nama " + nama);
    }

    public void membuatReview() {
        System.out.println("Rview Ditambahkan atas nama " + nama);
    }
}