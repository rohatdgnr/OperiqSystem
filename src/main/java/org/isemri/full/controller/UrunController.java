package org.isemri.full.controller;

import org.isemri.full.model.Urun;
import org.isemri.full.model.UrunMalzeme;
import org.isemri.full.repository.UrunRepository;
import org.isemri.full.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/urun")
public class UrunController {
    private final UrunService urunService;

    @Autowired
    private UrunRepository urunRepository;

    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }

    @GetMapping("/{urunAdi}/ihtiyac")
    public ResponseEntity<Map<String, Integer>> malzemeIhtiyaci(
            @PathVariable String urunAdi,
            @RequestParam int miktar) {
        Map<String, Integer> ihtiyac = urunService.hesaplaMalzemeIhtiyaci(urunAdi, miktar);
        return ResponseEntity.ok(ihtiyac);
    }


    @PostMapping("/api/urun")
    public ResponseEntity<Urun> urunEkle(@RequestBody Urun urun) {
        for (UrunMalzeme malzeme : urun.getUrunMalzemeler()) {
            malzeme.setUrun(urun);
        }

        Urun kaydedilenUrun = urunRepository.save(urun);
        return ResponseEntity.ok(kaydedilenUrun);
    }

    @GetMapping("/urunler")
    public ResponseEntity<List<Urun>> urunleriGetir() {
        List<Urun> urunler = urunRepository.findAll();
        return ResponseEntity.ok(urunler);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUrun(@PathVariable Long id) {
        Optional<Urun> urunOptional = urunRepository.findById(id);
        if (!urunOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        urunRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Urun> updateUrun(@PathVariable Long id, @RequestBody Urun urun) {
        Optional<Urun> urunOptional = urunRepository.findById(id);
        if (!urunOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        Urun existingUrun = urunOptional.get();
        existingUrun.setUrunAdi(urun.getUrunAdi());
        urunRepository.save(existingUrun);

        return ResponseEntity.ok(existingUrun);
    }

}
