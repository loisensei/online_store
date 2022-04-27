package com.ltw.online_store.Repository;

import com.ltw.online_store.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}