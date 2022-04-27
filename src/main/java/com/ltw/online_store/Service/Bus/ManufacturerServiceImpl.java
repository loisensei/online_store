package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.Manufacturer;
import com.ltw.online_store.Repository.ManufacturerRepository;
import com.ltw.online_store.Service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;


    @Override
    public void save(String name) {
        manufacturerRepository.save(new Manufacturer(name));
    }

    @Override
    public void save(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }
}
