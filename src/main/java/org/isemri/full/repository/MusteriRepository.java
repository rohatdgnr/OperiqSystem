package org.isemri.full.repository;

import org.isemri.full.model.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri, Long> {
    // Buraya özelleştirilmiş sorgular eklenebilir
}

