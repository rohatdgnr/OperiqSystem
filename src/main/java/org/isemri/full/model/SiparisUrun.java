package org.isemri.full.model;


import jakarta.persistence.*;

@Entity
public class SiparisUrun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "urun_id")
    private Urun urun;  // Sipariş edilen ürün

    @ManyToOne
    @JoinColumn(name = "siparis_id")
    private Siparis siparis;  // Bu ürünün ait olduğu sipariş

    private Integer miktar;
    private Double fiyat;

    public SiparisUrun() {}

    public SiparisUrun(Urun urun, Siparis siparis, Integer miktar, Double fiyat) {
        this.urun = urun;
        this.siparis = siparis;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public Integer getMiktar() {
        return miktar;
    }

    public void setMiktar(Integer miktar) {
        this.miktar = miktar;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
