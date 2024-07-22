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
@Table(name = "DatPhong")
public class DatPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dat_phong")
    private Integer idDatPhong;

    @Column(name = "ma_dat_phong")
    private String maDatPhong;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang",referencedColumnName = "id_khach_hang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "id_phong",referencedColumnName = "id_phong")
    private Phong phong;

    @Column(name = "ngay_nhan_phong")
    private Date ngayNhanPhong;

    @Column(name = "ngay_tra_phong")
    private Date ngayTraPhong;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @ManyToOne
    @JoinColumn(name = "id_khuyen_mai",referencedColumnName = "id_khuyen_mai")
    private KhuyenMai khuyenMai;

    @OneToMany
    @JoinColumn(name = "setCTDatPhong")
    private Set<ChiTietDatPhong> chiTietDatPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setLichSuDatPhong")
    private Set<LichSuDatPhong> lichSuDatPhongs = new HashSet<>();

}
