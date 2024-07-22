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
@Table(name = "ChiTietDatPhong")
public class ChiTietDatPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chi_tiet_dat_phong")
    private Integer idChiTietDatPhong;

    @Column(name = "ma_chi_tiet_dat_phong")
    private String maChiTietDatPhong;

    @ManyToOne
    @JoinColumn(name = "id_dat_phong",referencedColumnName = "id_dat_phong")
    private DatPhong datPhong;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang",referencedColumnName = "id_khach_hang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "id_khuyen_mai",referencedColumnName = "id_khuyen_mai")
    private KhuyenMai khuyenMai;

    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_phong",referencedColumnName = "id_chi_tiet_phong")
    private ChiTietPhong chiTietPhong;

    @Column(name = "ngay_lap")
    private Date ngayLap;

    @Column(name = "tong_tien")
    private Long tongTien;

    @OneToMany
    @JoinColumn(name = "setThanhToan")
    private Set<ThanhToan> thanhToans = new HashSet<>();


}
