package com.muhardin.endy.demo.timezone.dao;

import org.springframework.data.repository.CrudRepository;

import com.muhardin.endy.demo.timezone.entity.Pembayaran;

public interface PembayaranDao extends CrudRepository<Pembayaran, String> {
    
}
