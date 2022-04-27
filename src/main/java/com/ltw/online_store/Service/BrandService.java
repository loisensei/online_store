package com.ltw.online_store.Service;

import com.ltw.online_store.Entity.Brand;

public interface BrandService {
    void save(String name);
    void save(Brand brand);
}
