package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ThanhToan")
public class ThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_thanh_toan")
    private Integer idThanhToan;

    @Column(name = "ma_thanh_toan")
    private String maThanhToan;

    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_dat_phong",referencedColumnName = "id_chi_tiet_dat_phong")
    private ChiTietDatPhong chiTietDatPhong;

    @Column(name = "ngay_thanh_toan")
    private Data ngayThanhToan;

    @Column(name = "phuong_thuc")
    private Boolean phuongThuc;

    @Column(name = "so_tien")
    private Float soTien;

}
