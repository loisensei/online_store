package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.Brand;
import com.ltw.online_store.Repository.BrandRepository;
import com.ltw.online_store.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public boolean nhanHieuTonTai(Brand nhanHieu) {
        if(brandRepository.findByName(nhanHieu.getName()) != null){
            return true;
        }
        return false;
    }

    @Override
    public void deleteById(Long id) {
        brandRepository.deleteById(id);
    }


}
