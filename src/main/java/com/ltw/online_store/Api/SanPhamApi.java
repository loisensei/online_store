package com.ltw.online_store.Api;

import com.ltw.online_store.Dto.SanPhamDto;
import com.ltw.online_store.Entity.DoiTuongTraVe;
import com.ltw.online_store.Entity.SanPham;
import com.ltw.online_store.Service.NhanHieuService;
import com.ltw.online_store.Service.SanPhamService;
import com.ltw.online_store.Utils.TransferDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.validation.Valid;
import java.nio.file.Path;

@RestController
@RequestMapping("/api/sanpham")
public class SanPhamApi {
    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private NhanHieuService nhanHieuService;

    @Autowired
    private ServletContext app;

    @PostMapping("/luu")
    public DoiTuongTraVe luuSanPham(@ModelAttribute @Valid SanPhamDto sanPhamDto){
        DoiTuongTraVe doiTuongTraVe = new DoiTuongTraVe();
        System.out.println("Nhan Hieu; "+nhanHieuService.timTheoId(sanPhamDto.getNhanHieu()));
        System.out.println(sanPhamDto);
        if(sanPhamService.sanPhamTonTai(sanPhamDto.getTen())){
            doiTuongTraVe.setThongBao("Sản phẩm đã tồn tại!");
            return doiTuongTraVe;
        }else {
            String path = app.getRealPath("/");
            try {
                String filePath = path + "/WEB-INF/template/img/" + sanPhamDto.getAnh().getOriginalFilename();
                sanPhamDto.getAnh().transferTo(Path.of(filePath));
                sanPhamService.luuSanPham(sanPhamDto);
                System.out.println("filePath: " + filePath);
                doiTuongTraVe.setThongBao("Lưu thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return doiTuongTraVe;
    }
}
