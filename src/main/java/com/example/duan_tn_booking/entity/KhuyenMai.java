package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khuyen_mai")
    private Integer idKhuyenMai;

    @Column(name = "ma_khuyen_mai")
    private String maKhuyenMai;

    @Column(name = "ten_khuyen_mai")
    private String tenKhuyenMai;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Date ngayKetThuc;

    @Column(name = "giam_gia")
    private Float giamGia;

    @Column(name = "loai_giam")
    private Boolean loaiGiam;

    @OneToMany
    @JoinColumn(name = "setCTDatPhong")
    private Set<ChiTietDatPhong> chiTietDatPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setDatPhong")
    private Set<DatPhong> datPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setKhuyenMaiKH")
    private Set<KhuyenMaiKhachHang> khuyenMaiKhachHangs = new HashSet<>();
}
