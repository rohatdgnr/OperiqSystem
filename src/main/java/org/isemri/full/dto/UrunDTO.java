package org.isemri.full.dto;

import java.util.List;

public class UrunDTO {
    private String urunAdi;
    private int miktar;
    private List<UrunMalzemeDTO> malzemeler;

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public List<UrunMalzemeDTO> getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(List<UrunMalzemeDTO> malzemeler) {
        this.malzemeler = malzemeler;
    }

}