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
@Table(name = "NhanVien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nhan_vien")
    private Integer idNhanVien;

    @Column(name = "ma_nhan_vien")
    private String maNhanVien;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "luong")
    private Float luong;

    @ManyToOne
    @JoinColumn(name = "ten_dang_nhap",referencedColumnName = "ten_dang_nhap")
    private TaiKhoan taiKhoan;

    @OneToMany
    @JoinColumn(name = "setCSKH")
    private Set<ChamSocKhachHang> chamSocKhachHangs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setLichLamViec")
    private Set<LichLamViec> lichLamViecs = new HashSet<>();
}
