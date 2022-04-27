package com.ltw.online_store.Service;

import com.ltw.online_store.Entity.Manufacturer;

public interface ManufacturerService {
    void save(String name);
    void save(Manufacturer manufacturer);
}
