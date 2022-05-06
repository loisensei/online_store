package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Repository.GioHangRepository;
import com.ltw.online_store.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;
}
