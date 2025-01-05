package org.isemri.full.service;

import org.isemri.full.model.IsEmri;
import org.isemri.full.repository.IsEmriRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IsEmriService {

    private final IsEmriRepository isEmriRepository;

    public IsEmriService(IsEmriRepository isEmriRepository) {
        this.isEmriRepository = isEmriRepository;
    }

    public List<IsEmri> findAll() {
        return isEmriRepository.findAll();
    }

    public Optional<IsEmri> findById(Long id) {
        return isEmriRepository.findById(id);
    }

    public IsEmri save(IsEmri isEmri) {
        return isEmriRepository.save(isEmri);
    }

    public void deleteById(Long id) {
        isEmriRepository.deleteById(id);
    }
}
