package com.ltw.online_store.Service;

import com.ltw.online_store.Dto.SanPhamDto;
import com.ltw.online_store.Entity.SanPham;

import java.util.List;

public interface SanPhamService {
    List<SanPham> tatCaSanPham();
    void luuSanPham(SanPham sanPham);
    boolean sanPhamTonTai(String ten);
    void luuSanPham(SanPhamDto sanPhamDto);
}
