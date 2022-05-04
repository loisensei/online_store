package com.ltw.online_store.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Transient
    @JsonIgnore
    private MultipartFile anh;

    private String ten;
    private long gia;

    private String gioiTinh;

    private String mauSac;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private DanhMuc danhMuc;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private NhanHieu nhanHieu;

    private String moTa;
}
