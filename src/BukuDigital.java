
public class BukuDigital extends Buku implements BisaDiunduh {

    private double ukuran;
    private int diskonPersen;

    public BukuDigital(String judul, String penulis, int harga,
                       double ukuran, int diskonPersen) {
        super(judul, penulis, harga);
        this.ukuran = ukuran;
        this.diskonPersen = diskonPersen;
    }

    @Override
    public double ukuranMB() {
        return ukuran;
    }

    @Override
    public String getKeterangan() {
        return ukuran + " MB, diskon "
                + diskonPersen + "%";
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() * (100 - diskonPersen) / 100;
    }
}
