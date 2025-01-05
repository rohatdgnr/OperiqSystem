package org.isemri.full.controller;

import org.isemri.full.model.Siparis;
import org.isemri.full.service.SiparisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/siparis")
public class SiparisController {

    @Autowired
    private SiparisService siparisService;

    // Tüm siparişleri listele
    @GetMapping
    public List<Siparis> getAllSiparis() {
        return siparisService.getAllSiparis();
    }

    // Müşteri bazında siparişleri listele
    @GetMapping("/musteri/{musteriId}")
    public List<Siparis> getSiparisByMusteri(@PathVariable Long musteriId) {
        return siparisService.getSiparisByMusteri(musteriId);
    }

    // Yeni sipariş oluştur
    @PostMapping
    public ResponseEntity<Siparis> createSiparis(@RequestBody Siparis siparis) {
        Siparis savedSiparis = siparisService.createSiparis(siparis);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSiparis);
    }

    // Sipariş güncelle
    @PutMapping("/{id}")
    public ResponseEntity<Siparis> updateSiparis(@PathVariable Long id, @RequestBody Siparis siparis) {
        Siparis updatedSiparis = siparisService.updateSiparis(id, siparis);
        if (updatedSiparis != null) {
            return ResponseEntity.ok(updatedSiparis);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Sipariş sil
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSiparis(@PathVariable Long id) {
        boolean deleted = siparisService.deleteSiparis(id);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

