
public class StrukPrinter {

    public void cetakKeranjang(String judul, Keranjang keranjang) {

        System.out.println("\n=========== " + judul + " ===========");

        for (Buku buku : keranjang.getIsi()) {

            System.out.println(
                    buku.getJudul() + " (" + buku.getPenulis() + ")"
            );

            System.out.printf(
                    "  Harga       : %s%n",
                    Buku.formatRupiah(buku.getHarga())
            );

            System.out.printf(
                    "  Keterangan  : %s%n",
                    buku.getKeterangan()
            );

            System.out.printf(
                    "  Harga akhir : %s%n",
                    Buku.formatRupiah(buku.hitungHargaAkhir())
            );
        }

        System.out.println("-----------------------------------------");

        System.out.println(
                "Total belanja : "
                        + Buku.formatRupiah(keranjang.hitungTotal())
        );
    }

    public void cetakPembayaran(
            int totalBelanja,
            MetodeBayar[] pilihan
    ) {

        System.out.println("-------------- PEMBAYARAN ---------------");

        for (MetodeBayar metode : pilihan) {

            System.out.printf(
                    "%-20s : %s%n",
                    metode.nama(),
                    Buku.formatRupiah(
                            metode.totalBayar(totalBelanja)
                    )
            );
        }
    }
}

