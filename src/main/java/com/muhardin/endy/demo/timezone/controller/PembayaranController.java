package com.muhardin.endy.demo.timezone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.muhardin.endy.demo.timezone.dao.PembayaranDao;
import com.muhardin.endy.demo.timezone.entity.Pembayaran;

@RestController
public class PembayaranController {

    @Autowired private PembayaranDao pembayaranDao;
    
    @PostMapping("/api/pembayaran/")
    @ResponseStatus(HttpStatus.CREATED)
    public void simpan(@RequestBody Pembayaran pembayaran) {
        pembayaranDao.save(pembayaran);
    }

    @GetMapping("/api/pembayaran/")
    public Iterable<Pembayaran> dataPembayaran(){
        return pembayaranDao.findAll();
    }
}
