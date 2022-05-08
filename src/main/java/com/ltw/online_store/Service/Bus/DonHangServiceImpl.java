package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Entity.DonHang;
import com.ltw.online_store.Repository.DonHangRepository;
import com.ltw.online_store.Service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DonHangServiceImpl implements DonHangService {
    @Autowired
    private DonHangRepository donHangRepository;

    @Override
    public DonHang luuDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }
}
