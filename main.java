public class main {
    public static void main(String[] args) {
        System system = new CustomSystem();
        System.out.println("\"Verifikasi Gopay: \" + system.verifikasiGopay"());
        System.out.println("Harga perjalanan: " + system.getHarga("A", "B"));

        User user = new User();
        user.setUser("U001", "Budi", 123456789, 50000);
        System.out.println("Nama User: " + user.getNama());
        user.topupGopay(10000);

        Driver driver = new Driver();
        driver.setDriver("D001", "Andi", 987654321, 300000);
        driver.konfirmasiOrder();
        driver.withdrawSaldoIncome(50000);

        Order order = new Order();
        order.setOrder("O001", "U001", "A", "B", 10.5, 15.0, 21000);
        System.out.println("Order ID: " + order.getIdorder());

        Review review = new Review();
        review.setReview("R001", "U001", "Pelayanan memuaskan.");
        System.out.println("Review: " + review.getReview());
    }
}
