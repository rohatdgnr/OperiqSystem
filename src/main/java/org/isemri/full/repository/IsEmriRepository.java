package org.isemri.full.repository;

import org.isemri.full.model.IsEmri;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IsEmriRepository extends JpaRepository<IsEmri, Long> {
}

