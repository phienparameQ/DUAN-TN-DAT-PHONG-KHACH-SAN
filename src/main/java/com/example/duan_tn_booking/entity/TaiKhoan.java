package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {

    @Id
    @Column(name = "ten_dang_nhap")
    private String tenDangNhap;

    @Column(name = "mat_khau")
    private String matKhau;

    @OneToMany
    @JoinColumn(name = "setKhachHang")
    private Set<KhachHang> khachHangs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setNhanVien")
    private Set<NhanVien> nhanViens = new HashSet<>();

}
