package com.ltw.online_store.Controller;

import com.ltw.online_store.Entity.DanhMuc;
import com.ltw.online_store.Entity.NhanHieu;
import com.ltw.online_store.Entity.NguoiDung;
import com.ltw.online_store.Service.DanhMucService;
import com.ltw.online_store.Service.NhanHieuService;
import com.ltw.online_store.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@SessionAttributes("nguoiDungHienTai")
public class GioHangController {


    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private NhanHieuService nhanHieuService;

    @Autowired
    private DanhMucService danhMucService;

    @ModelAttribute("nguoiDungHienTai")
    public NguoiDung loggerInUser() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungService.findByTenDangNhap(au.getName());
    }

    @ModelAttribute("cacNhanHieu")
    public List<NhanHieu> cacNhanHieu(){
        return nhanHieuService.getAll();
    }

    @ModelAttribute("cacDanhMuc")
    public List<DanhMuc> cacDanhMuc(){
        return danhMucService.tatCaDanhMuc();
    }

    @GetMapping("/gio-hang")
    public String cartPage(){
        return "web/giohang";
    }

    @GetMapping("/them-san-pham")
    public String themSanPhamVaoGio(HttpServletRequest request){
        NguoiDung nguoiDung = (NguoiDung) request.getSession().getAttribute("loggerInUser");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Nguoi dung: "+nguoiDung);
        System.out.println("au: "+auth.getPrincipal());
        return "redirect:/trang-chu";
    }
}
