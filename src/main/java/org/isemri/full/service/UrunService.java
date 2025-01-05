package org.isemri.full.service;

import jakarta.transaction.Transactional;
import org.isemri.full.model.Urun;
import org.isemri.full.model.UrunMalzeme;
import org.isemri.full.repository.UrunRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UrunService {
    private final UrunRepository urunRepository;

    public UrunService(UrunRepository urunRepository) {
        this.urunRepository = urunRepository;
    }



    public Map<String, Integer> hesaplaMalzemeIhtiyaci(String urunAdi, int miktar) {
        Urun urun = urunRepository.findByUrunAdi(urunAdi)
                .orElseThrow(() -> new RuntimeException("Ürün bulunamadı: " + urunAdi));
        Map<String, Integer> ihtiyac = new HashMap<>();
        for (UrunMalzeme urunMalzeme : urun.getUrunMalzemeler()) {
            ihtiyac.put(urunMalzeme.getMalzemeAdi(), urunMalzeme.getBirimMiktar() * miktar);
        }

        return ihtiyac;
    }

    @Transactional
    public Urun urunEkle(Urun urun) {
        for (UrunMalzeme malzeme : urun.getUrunMalzemeler()) {
            malzeme.setUrun(urun);
        }
        return urunRepository.save(urun);
    }
}
