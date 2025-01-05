package org.isemri.full.model;



import jakarta.persistence.*;

@Entity
@Table(name = "stok")
public class Stok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String malzemeAdi;

    @Column(nullable = false)
    private Integer mevcutMiktar;

    @Column(nullable = false)
    private Integer kritikSeviye;

    // Getters and Setters
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

    public Integer getMevcutMiktar() {
        return mevcutMiktar;
    }

    public void setMevcutMiktar(Integer mevcutMiktar) {
        this.mevcutMiktar = mevcutMiktar;
    }

    public Integer getKritikSeviye() {
        return kritikSeviye;
    }

    public void setKritikSeviye(Integer kritikSeviye) {
        this.kritikSeviye = kritikSeviye;
    }
}

