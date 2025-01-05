package org.isemri.full.controller;

import org.isemri.full.model.IsEmri;
import org.isemri.full.service.IsEmriService;
import org.isemri.full.service.StokService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5510")
@RestController
@RequestMapping("/api/is-emri")
public class IsEmriController {

    private final IsEmriService isEmriService;

    private  StokService stokService;

    public IsEmriController(IsEmriService isEmriService) {
        this.isEmriService = isEmriService;
    }


    @GetMapping
    public List<IsEmri> getAllIsEmri() {
        return isEmriService.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<IsEmri> getIsEmriById(@PathVariable Long id) {
        return isEmriService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<?> createIsEmri(@RequestBody IsEmri isEmri) {
        try {
            if (stokService.checkStok(isEmri.getIsEmriUrun(), isEmri.getIsEmriMiktar())) {
                stokService.reduceStok(isEmri.getIsEmriUrun(), isEmri.getIsEmriMiktar());
            } else {
                return ResponseEntity.badRequest().body("Yeterli stok bulunamadı. Üretim için yönlendirme gerekli.");
            }

            IsEmri createdIsEmri = isEmriService.save(isEmri);
            return ResponseEntity.status(201).body(createdIsEmri);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("İşlem sırasında hata oluştu: " + e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<IsEmri> updateIsEmri(@PathVariable Long id, @RequestBody IsEmri isEmri) {
        return isEmriService.findById(id).map(existingIsEmri -> {
            isEmri.setId(existingIsEmri.getId());
            IsEmri updatedIsEmri = isEmriService.save(isEmri);
            return ResponseEntity.ok(updatedIsEmri);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIsEmri(@PathVariable Long id) {
        if (isEmriService.findById(id).isPresent()) {
            isEmriService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
