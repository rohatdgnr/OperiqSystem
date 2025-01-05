package org.isemri.full.controller;

import org.isemri.full.model.IsEmri;
import org.isemri.full.model.Stok;
import org.isemri.full.service.IsEmriService;
import org.isemri.full.service.StokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StokController {

    @Autowired
    private StokService stokService;

    @Autowired
    private IsEmriService isEmriService;

    @PostMapping("/stok")
    public ResponseEntity<Stok> addStok(@RequestBody Stok stok) {
        Stok createdStok = stokService.addStok(stok);
        return ResponseEntity.status(201).body(createdStok); // 201 Created döner
    }


    @GetMapping("/stok")
    public ResponseEntity<List<Stok>> getAllStok() {
        List<Stok> stokList = stokService.getAllStok();
        return ResponseEntity.ok(stokList); // 200 OK döner
    }


}
