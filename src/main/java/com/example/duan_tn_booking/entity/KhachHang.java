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
@Table(name = "KhachHang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

    @Column(name = "ma_khach_hang")
    private String maKhachHang;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "ngay_sinh")
    private String ngaySinh;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "ten_dang_nhap",referencedColumnName = "ten_dang_nhap")
    private TaiKhoan taiKhoan;

    @OneToMany
    @JoinColumn(name = "setCSKH")
    private Set<ChamSocKhachHang> chamSocKhachHangs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setCTDatPhong")
    private Set<ChiTietDatPhong> chiTietDatPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setDatPhong")
    private Set<DatPhong> datPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setTichDiem")
    private Set<TichDiem> tichDiems = new HashSet<>();
}
