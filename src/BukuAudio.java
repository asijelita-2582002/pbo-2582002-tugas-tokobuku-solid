
public class BukuAudio extends Buku {

    private int durasiMenit;
    private int diskonPersen;

    public BukuAudio(String judul, String penulis, int harga,
                     int durasiMenit, int diskonPersen) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
        this.diskonPersen = diskonPersen;
    }

    @Override
    public String getKeterangan() {
        return durasiMenit + " menit, diskon "
                + diskonPersen + "%";
    }

    @Override
    public int hitungHargaAkhir() {
        return getHarga() * (100 - diskonPersen) / 100;
    }
}
