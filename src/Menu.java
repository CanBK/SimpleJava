public class Menu {
    String menu;
    Double harga;
    int pesanan;

    public Menu(String menu, Double harga) {
        this.menu = menu;
        this.harga = harga;
    }

    public int getPesanan() {
        return pesanan;
    }

    public void setPesanan(int pesanan) {
        this.pesanan = pesanan;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
}
