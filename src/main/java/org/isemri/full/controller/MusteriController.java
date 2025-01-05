package org.isemri.full.controller;

import org.isemri.full.model.Musteri;
import org.isemri.full.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musteri")
public class MusteriController {

    @Autowired
    private MusteriService musteriService;

    // Müşteri listeleme
    @GetMapping
    public List<Musteri> getAllMusteri() {
        return musteriService.getAllMusteri();
    }

    // Müşteri ekleme
    @PostMapping
    public ResponseEntity<Musteri> createMusteri(@RequestBody Musteri musteri) {
        Musteri savedMusteri = musteriService.createMusteri(musteri);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMusteri);
    }

    // Müşteri güncelleme
    @PutMapping("/{id}")
    public ResponseEntity<Musteri> updateMusteri(@PathVariable Long id, @RequestBody Musteri musteri) {
        Musteri updatedMusteri = musteriService.updateMusteri(id, musteri);
        if (updatedMusteri != null) {
            return ResponseEntity.ok(updatedMusteri);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Müşteri silme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusteri(@PathVariable Long id) {
        boolean deleted = musteriService.deleteMusteri(id);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
