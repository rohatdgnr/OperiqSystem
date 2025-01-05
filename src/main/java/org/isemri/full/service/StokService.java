package org.isemri.full.service;


import org.isemri.full.model.Stok;
import org.isemri.full.repository.StokRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StokService {

    @Autowired
    private StokRepository stokRepository;

    public Stok addStok(Stok stok) {
        return stokRepository.save(stok);
    }


    public Stok updateStok(Long id, Integer miktar) {
        Optional<Stok> optionalStok = stokRepository.findById(id);
        if (optionalStok.isPresent()) {
            Stok stok = optionalStok.get();
            stok.setMevcutMiktar(stok.getMevcutMiktar() + miktar);
            return stokRepository.save(stok);
        } else {
            throw new RuntimeException("Stok bulunamadı!");
        }
    }


    public boolean checkStok(String malzemeAdi, int gerekliMiktar) {
        Optional<Stok> optionalStok = stokRepository.findByMalzemeAdi(malzemeAdi);
        return optionalStok.map(stok -> stok.getMevcutMiktar() >= gerekliMiktar).orElse(false);
    }


    public void reduceStok(String malzemeAdi, int miktar) {
        Optional<Stok> optionalStok = stokRepository.findByMalzemeAdi(malzemeAdi);
        if (optionalStok.isPresent()) {
            Stok stok = optionalStok.get();
            if (stok.getMevcutMiktar() < miktar) {
                throw new RuntimeException("Yeterli stok yok!");
            }
            stok.setMevcutMiktar(stok.getMevcutMiktar() - miktar);
            stokRepository.save(stok);
        } else {
            throw new RuntimeException("Stok bulunamadı!");
        }
    }


    public List<Stok> getAllStok() {
        return stokRepository.findAll();
    }


}

