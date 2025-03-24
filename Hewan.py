// Superclass
class Hewan {
    protected String nama;
    protected String jenisMakanan;

    public Hewan(String nama, String jenisMakanan) {
        this.nama = nama;
        this.jenisMakanan = jenisMakanan;
    }

    public void suara() {
        System.out.println("Hewan ini bersuara.");
    }

    // Method overloading
    public void suara(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            suara();
        }
    }
}

// Subclass pertama
class singa extends Hewan {
    public singa(String nama) {
        super(nama, "Carnivora");
    }

    @Override
    public void suara() {
        System.out.println(nama + ": Roarrr!");
    }
}

// Subclass kedua
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Omnivora");
    }

    @Override
    public void suara() {
        System.out.println(nama + ": Guk guk!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan("Hewan Umum", "Herbivora");
        hewanUmum.suara();
        System.out.println();

        singa singa = new singa("Simba");
        singa.suara();
        System.out.println();

        Anjing anjing = new Anjing("Buddy");
        anjing.suara();
        System.out.println();

        // Demonstrasi method overloading
        singa.suara(3);
    }
}
