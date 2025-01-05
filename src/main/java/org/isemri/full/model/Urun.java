package org.isemri.full.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // Eğer ürün adı benzersiz olmalıysa
    private String urunAdi;

    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<UrunMalzeme> urunMalzemeler = new ArrayList<>();

    public Urun() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public List<UrunMalzeme> getUrunMalzemeler() {
        return urunMalzemeler;
    }

    public void setUrunMalzemeler(List<UrunMalzeme> urunMalzemeler) {
        this.urunMalzemeler = urunMalzemeler;
    }
}