public class Order {
    private String idOrder;
    private String idUser;
    private String awal;
    private String tujuan;
    private double jarak;
    private double durasi;
    private int harga;

    public void setOrder(String idOrder, String idUser, String awal, String tujuan, double jarak, double durasi, int harga) {
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.awal = awal;
        this.tujuan = tujuan;
        this.jarak = jarak;
        this.durasi = durasi;
        this.harga = harga;
    }

    public String getIdOrder() {
        return idOrder;
    }
}
