package org.isemri.full.repository;


import org.isemri.full.model.Stok;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StokRepository extends JpaRepository<Stok, Long> {

    Optional<Stok> findByMalzemeAdi(String malzemeAdi);

}

