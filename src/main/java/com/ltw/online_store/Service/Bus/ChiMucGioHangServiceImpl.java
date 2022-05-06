package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Repository.ChiMucGioHangRepository;
import com.ltw.online_store.Service.ChiMucGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiMucGioHangServiceImpl implements ChiMucGioHangService {
    @Autowired
    private ChiMucGioHangRepository chiMucGioHangRepository;
}
