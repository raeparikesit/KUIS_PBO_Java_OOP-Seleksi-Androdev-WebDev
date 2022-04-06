package pbo.kuis;
import pbo.kuis.Lamaran;

public class AndroDev extends Pelamar implements Lamaran {
    
    public AndroDev (String nama,  double nilai1, double nilai2, double nilai3) {
        super(nama,nilai1, nilai2, nilai3);
    }
    
    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public void setNilai3(double nilai3) {
        this.nilai3 = nilai3;
    }
  @Override
    public String keterangan() {
        if(this.hitungNilaiAkhir() >= 85) return "LOLOS\nSelamat kepada " + this.nama + " telah diterima sebagai Android Development";
        else return "GAGAL\nMohon Maaf kepada " + this.nama + " tidak diterima sebagai Android Development";
    }

    @Override
    public double hitungNilaiAkhir() {
        return (this.nilai1 * 0.2) + (this.nilai2 * 0.5) + (this.nilai3* 0.3);
    }
}

