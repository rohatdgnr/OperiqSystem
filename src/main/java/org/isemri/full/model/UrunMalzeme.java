package org.isemri.full.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class UrunMalzeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String malzemeAdi;
    private int birimMiktar;


    @ManyToOne
    @JoinColumn(name = "urunAdi", referencedColumnName = "urunAdi", nullable = false)
    @JsonBackReference
    private Urun urun;

    public UrunMalzeme() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMalzemeAdi() {
        return malzemeAdi;
    }

    public void setMalzemeAdi(String malzemeAdi) {
        this.malzemeAdi = malzemeAdi;
    }

    public int getBirimMiktar() {
        return birimMiktar;
    }

    public void setBirimMiktar(int birimMiktar) {
        this.birimMiktar = birimMiktar;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }
}