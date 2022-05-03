package com.ltw.online_store.Api;

import com.ltw.online_store.Entity.Brand;
import com.ltw.online_store.Entity.DoiTuongTraVe;
import com.ltw.online_store.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brand")
public class NhanHieuApi {
    @Autowired
    private BrandService brandService;

    @GetMapping("/get/all")
    public ResponseEntity<?> brands(){
        return ResponseEntity.ok(brandService.getAll());
    }

    @PostMapping("/save")
    public DoiTuongTraVe saveBrand(@RequestBody Brand brand){
        DoiTuongTraVe doiTuongTraVe = new DoiTuongTraVe();
        if(brandService.nhanHieuTonTai(brand)){
            doiTuongTraVe.setThongBao("Nhãn hiệu đã tồn tại!");
            return doiTuongTraVe;
        }else{
            brandService.save(brand);
            doiTuongTraVe.setThongBao("Thêm thành công");
        }
        return doiTuongTraVe;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBrand(@PathVariable Long id){
        brandService.deleteById(id);
    }

}
