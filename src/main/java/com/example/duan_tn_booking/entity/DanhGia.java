package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DanhGia")
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_danh_gia")
    private Integer idDanhGia;

    @Column(name = "ma_danh_gia")
    private String maDanhGia;

    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_phong",referencedColumnName = "id_chi_tiet_phong")
    private ChiTietPhong chiTietPhong;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "diem_danh_gia")
    private Long diemDanhGia;

    @Column(name = "ngay_danh_gia")
    private Date ngayDanhGia;

}
