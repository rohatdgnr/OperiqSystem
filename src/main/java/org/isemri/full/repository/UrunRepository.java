package org.isemri.full.repository;

import org.isemri.full.model.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrunRepository extends JpaRepository<Urun, Long> {
    Optional<Urun> findByUrunAdi(String urunAdi);
}
