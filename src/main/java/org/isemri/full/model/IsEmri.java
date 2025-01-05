package org.isemri.full.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "is_emri")
public class IsEmri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String isEmriNo;

    @Column(nullable = false)
    private LocalDate tarih;

    private Integer siraNo;

    private String makine;

    private String siparisUrun;

    private String isEmriUrun;

    @Column(nullable = false)
    private Integer isEmriMiktar;

    @Column(nullable = false)
    private String isEmriSema;

    private String firma;

    private String siparis;

    private String mamulUret;

    private LocalDate baslangicZamani;

    private LocalDate bitisZamani;

    private String notlar;

    private LocalDate musteriTalepTarihi;

    private LocalDate terminTarihiPlanlama;

    private String terminDurumu;

    private Boolean kapali;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsEmriNo() {
        return isEmriNo;
    }

    public void setIsEmriNo(String isEmriNo) {
        this.isEmriNo = isEmriNo;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public Integer getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(Integer siraNo) {
        this.siraNo = siraNo;
    }

    public String getMakine() {
        return makine;
    }

    public void setMakine(String makine) {
        this.makine = makine;
    }

    public String getSiparisUrun() {
        return siparisUrun;
    }

    public void setSiparisUrun(String siparisUrun) {
        this.siparisUrun = siparisUrun;
    }

    public String getIsEmriUrun() {
        return isEmriUrun;
    }

    public void setIsEmriUrun(String isEmriUrun) {
        this.isEmriUrun = isEmriUrun;
    }

    public Integer getIsEmriMiktar() {
        return isEmriMiktar;
    }

    public void setIsEmriMiktar(Integer isEmriMiktar) {
        this.isEmriMiktar = isEmriMiktar;
    }

    public String getIsEmriSema() {
        return isEmriSema;
    }

    public void setIsEmriSema(String isEmriSema) {
        this.isEmriSema = isEmriSema;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getSiparis() {
        return siparis;
    }

    public void setSiparis(String siparis) {
        this.siparis = siparis;
    }

    public String getMamulUret() {
        return mamulUret;
    }

    public void setMamulUret(String mamulUret) {
        this.mamulUret = mamulUret;
    }

    public LocalDate getBaslangicZamani() {
        return baslangicZamani;
    }

    public void setBaslangicZamani(LocalDate baslangicZamani) {
        this.baslangicZamani = baslangicZamani;
    }

    public LocalDate getBitisZamani() {
        return bitisZamani;
    }

    public void setBitisZamani(LocalDate bitisZamani) {
        this.bitisZamani = bitisZamani;
    }

    public String getNotlar() {
        return notlar;
    }

    public void setNotlar(String notlar) {
        this.notlar = notlar;
    }

    public LocalDate getMusteriTalepTarihi() {
        return musteriTalepTarihi;
    }

    public void setMusteriTalepTarihi(LocalDate musteriTalepTarihi) {
        this.musteriTalepTarihi = musteriTalepTarihi;
    }

    public LocalDate getTerminTarihiPlanlama() {
        return terminTarihiPlanlama;
    }

    public void setTerminTarihiPlanlama(LocalDate terminTarihiPlanlama) {
        this.terminTarihiPlanlama = terminTarihiPlanlama;
    }

    public String getTerminDurumu() {
        return terminDurumu;
    }

    public void setTerminDurumu(String terminDurumu) {
        this.terminDurumu = terminDurumu;
    }

    public Boolean getKapali() {
        return kapali;
    }

    public void setKapali(Boolean kapali) {
        this.kapali = kapali;
    }
}
