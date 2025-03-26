public class System {
    public boolean verifikasiGopay(int saldo) {
        return saldo > 0;
    }

    public int getHarga(String awal, String tujuan) {
        // Dummy pricing logic
        return 10000;
    }

    public void broadcastOrder() {
        System.out.println("Order broadcasted to nearby drivers.");
    }
}
