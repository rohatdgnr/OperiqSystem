package org.isemri.full.service;

import org.isemri.full.model.Musteri;
import org.isemri.full.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusteriService {

    @Autowired
    private MusteriRepository musteriRepository;

    // Tüm müşterileri getir
    public List<Musteri> getAllMusteri() {
        return musteriRepository.findAll();
    }

    // Müşteri ekle
    public Musteri createMusteri(Musteri musteri) {
        return musteriRepository.save(musteri);
    }

    // Müşteri güncelle
    public Musteri updateMusteri(Long id, Musteri musteri) {
        Optional<Musteri> existingMusteri = musteriRepository.findById(id);
        if (existingMusteri.isPresent()) {
            Musteri updatedMusteri = existingMusteri.get();
            updatedMusteri.setAd(musteri.getAd());
            updatedMusteri.setSoyad(musteri.getSoyad());
            updatedMusteri.setEmail(musteri.getEmail());
            updatedMusteri.setTelefon(musteri.getTelefon());
            return musteriRepository.save(updatedMusteri);
        }
        return null;  // Müşteri bulunamadı
    }

    // Müşteri sil
    public boolean deleteMusteri(Long id) {
        if (musteriRepository.existsById(id)) {
            musteriRepository.deleteById(id);
            return true;
        }
        return false;  // Müşteri bulunamadı
    }
}

