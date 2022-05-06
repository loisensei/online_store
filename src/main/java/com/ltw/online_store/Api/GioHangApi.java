package com.ltw.online_store.Api;

import com.ltw.online_store.Entity.DoiTuongTraVe;
import com.ltw.online_store.Entity.NguoiDung;
import com.ltw.online_store.Entity.SanPham;
import com.ltw.online_store.Service.GioHangService;
import com.ltw.online_store.Service.NguoiDungService;
import com.ltw.online_store.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/giohang")
@SessionAttributes("nguoiDung")
public class GioHangApi {

    @Autowired
    private GioHangService gioHangService;

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @ModelAttribute("nguoiDung")
    public NguoiDung nguoiDung() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungService.findByTenDangNhap(au.getName());
    }

    @GetMapping("/themvaogio/{id}")
    public DoiTuongTraVe themSanPhamVaoGioHang(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        DoiTuongTraVe doiTuongTraVe = new DoiTuongTraVe();
        SanPham sanPham = sanPhamService.timTheoId(id);
        NguoiDung nd = (NguoiDung) request.getSession().getAttribute("nguoiDung");
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        if(au == null || au.getPrincipal() == "anonymousUser"){
            doiTuongTraVe.setTrangThai("chuadangnhap");
            doiTuongTraVe.setThongBao("vui long dang nhap");
            return doiTuongTraVe;
        }
        doiTuongTraVe.setThongBao("them thanh cong");
        return doiTuongTraVe;
    }


}
