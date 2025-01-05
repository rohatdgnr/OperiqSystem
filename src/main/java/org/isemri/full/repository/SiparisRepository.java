package org.isemri.full.repository;

import org.isemri.full.model.Musteri;
import org.isemri.full.model.Siparis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SiparisRepository extends JpaRepository<Siparis, Long> {
    // Siparişleri müşteriye göre bulmak için özelleştirilmiş bir metot
    List<Siparis> findByMusteri(Musteri musteri);
}
