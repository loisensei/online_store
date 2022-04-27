package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.Brand;
import com.ltw.online_store.Repository.BrandRepository;
import com.ltw.online_store.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;


    @Override
    public void save(String name) {
        brandRepository.save(new Brand(name));
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(brand);
    }
}
