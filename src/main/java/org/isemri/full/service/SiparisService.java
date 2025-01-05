package org.isemri.full.service;

import org.isemri.full.model.Musteri;
import org.isemri.full.model.Siparis;
import org.isemri.full.repository.MusteriRepository;
import org.isemri.full.repository.SiparisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiparisService {

    @Autowired
    private SiparisRepository siparisRepository;

    @Autowired
    private MusteriRepository musteriRepository;

    public Siparis createSiparis(Siparis siparis) {
        return siparisRepository.save(siparis);
    }

    public List<Siparis> getAllSiparis() {
        return siparisRepository.findAll();
    }

    public List<Siparis> getSiparisByMusteri(Long musteriId) {
        Optional<Musteri> musteri = musteriRepository.findById(musteriId);
        if (musteri.isPresent()) {
            return siparisRepository.findByMusteri(musteri.get());
        }
        return null;
    }

    public Siparis updateSiparis(Long id, Siparis siparis) {
        Optional<Siparis> existingSiparis = siparisRepository.findById(id);
        if (existingSiparis.isPresent()) {
            Siparis updatedSiparis = existingSiparis.get();
            updatedSiparis.setSiparisTarihi(siparis.getSiparisTarihi());
            updatedSiparis.setMusteri(siparis.getMusteri());
            updatedSiparis.setSiparisUrunleri(siparis.getSiparisUrunleri());
            updatedSiparis.setToplamFiyat(siparis.getToplamFiyat());
            return siparisRepository.save(updatedSiparis);
        }
        return null;
    }

    public boolean deleteSiparis(Long id) {
        if (siparisRepository.existsById(id)) {
            siparisRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

