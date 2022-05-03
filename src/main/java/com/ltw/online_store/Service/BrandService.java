package com.ltw.online_store.Service;

import com.ltw.online_store.Entity.Brand;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BrandService {
    void save(String name);
    void save(Brand brand);
    List<Brand> getAll();
    boolean nhanHieuTonTai(Brand nhanHieu);
    void deleteById(Long id);
}
