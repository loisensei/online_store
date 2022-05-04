package com.ltw.online_store.Controller;

import com.ltw.online_store.Entity.NhanHieu;
import com.ltw.online_store.Entity.DanhMuc;
import com.ltw.online_store.Entity.User;
import com.ltw.online_store.Service.NhanHieuService;
import com.ltw.online_store.Service.DanhMucService;
import com.ltw.online_store.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@SessionAttributes("loggerInUser")
public class NguoiDungController {

    @Autowired
    private UserService userService;

    @Autowired
    private NhanHieuService nhanHieuService;

    @Autowired
    private DanhMucService danhMucService;

    @ModelAttribute("loggerInUser")
    public User loggerInUser() {
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        return userService.findByUserName(au.getName());
    }

    @ModelAttribute("cacNhanHieu")
    public List<NhanHieu> cacNhanHieu(){
        return nhanHieuService.getAll();
    }

    @ModelAttribute("cacDanhMuc")
    public List<DanhMuc> cacDanhMuc(){
        return danhMucService.tatCaDanhMuc();
    }

    @GetMapping("/dang-nhap")
    public String trangDangNhap(){
        return "dangnhap";
    }

    @GetMapping("/trang-chu")
    public String trangChu(){
        return "web/trangchu";
    }

    @GetMapping("/lien-he")
    public String trangLienHe(){
        return "web/lienhe";
    }

    @GetMapping("/thong-tin-tai-khoan")
    public String trangThongTinNguoiDung(){
        return "web/thongtin";
    }

    @GetMapping("/dang-xuat")
    public String trangDangXuat(HttpServletRequest request, HttpServletResponse response, Model model){
        Authentication au = SecurityContextHolder.getContext().getAuthentication();
        String userName = au.getName();
        System.out.println(userName);
        if(au != null){
            new SecurityContextLogoutHandler().logout(request, response,au);
        }
        return "redirect:/dang-nhap?dang-xuat";
    }

}
