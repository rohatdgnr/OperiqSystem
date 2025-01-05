package org.isemri.full.dto;

public class UrunMalzemeDTO {
    private String malzemeAdi;
    private String malzemeKodu;
    private int birimMiktar;

    public String getMalzemeAdi() {
        return malzemeAdi;
    }

    public void setMalzemeAdi(String malzemeAdi) {
        this.malzemeAdi = malzemeAdi;
    }

    public String getMalzemeKodu() {
        return malzemeKodu;
    }

    public void setMalzemeKodu(String malzemeKodu) {
        this.malzemeKodu = malzemeKodu;
    }

    public int getBirimMiktar() {
        return birimMiktar;
    }

    public void setBirimMiktar(int birimMiktar) {
        this.birimMiktar = birimMiktar;
    }

}
