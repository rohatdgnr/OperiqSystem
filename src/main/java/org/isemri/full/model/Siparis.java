package org.isemri.full.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Siparis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date siparisTarihi;

    @ManyToOne
    @JoinColumn(name = "musteri_id")
    private Musteri musteri;  // Siparişin ait olduğu müşteri

    @OneToMany(mappedBy = "siparis")
    private List<SiparisUrun> siparisUrunleri;  // Siparişin içerisindeki ürünler

    private Double toplamFiyat;

    public Siparis() {}

    public Siparis(Date siparisTarihi, Musteri musteri, List<SiparisUrun> siparisUrunleri, Double toplamFiyat) {
        this.siparisTarihi = siparisTarihi;
        this.musteri = musteri;
        this.siparisUrunleri = siparisUrunleri;
        this.toplamFiyat = toplamFiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(Date siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public List<SiparisUrun> getSiparisUrunleri() {
        return siparisUrunleri;
    }

    public void setSiparisUrunleri(List<SiparisUrun> siparisUrunleri) {
        this.siparisUrunleri = siparisUrunleri;
    }

    public Double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(Double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}

