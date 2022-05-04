package com.ltw.online_store.Service.Bus;

import com.ltw.online_store.Dto.SanPhamDto;
import com.ltw.online_store.Entity.SanPham;
import com.ltw.online_store.Repository.NhanHieuRepository;
import com.ltw.online_store.Repository.SanPhamRepository;
import com.ltw.online_store.Service.DanhMucService;
import com.ltw.online_store.Service.NhanHieuService;
import com.ltw.online_store.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private NhanHieuService nhanHieuService;

    @Autowired
    private DanhMucService danhMucService;

    @Override
    public List<SanPham> tatCaSanPham() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void luuSanPham(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }

    @Override
    public boolean sanPhamTonTai(String ten) {
        if(sanPhamRepository.findSanPhamByTen(ten) != null) return true;
        return false;
    }

    @Override
    public void luuSanPham(SanPhamDto sanPhamDto) {
        SanPham sanPham = new SanPham();
        sanPham.setAnh(sanPhamDto.getAnh());
        sanPham.setGia(sanPhamDto.getGia());
        System.out.println("nhan hieu: "+nhanHieuService.timTheoId(sanPhamDto.getNhanHieu()));
        sanPham.setNhanHieu(nhanHieuService.timTheoId(sanPhamDto.getNhanHieu()));
        sanPham.setDanhMuc(danhMucService.timTheoId(sanPhamDto.getDanhMuc()));

        sanPham.setMauSac(sanPhamDto.getMauSac());
        sanPham.setGioiTinh(sanPhamDto.getGioiTinh());
        sanPham.setMoTa(sanPhamDto.getMoTa());

        sanPham.setSoLuong(sanPhamDto.getSoLuong());
        sanPham.setPathAnh("/img/" + sanPhamDto.getAnh().getOriginalFilename());
        sanPhamRepository.save(sanPham);
    }
}
