package com.ltw.online_store.Repository;

import com.ltw.online_store.Entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}