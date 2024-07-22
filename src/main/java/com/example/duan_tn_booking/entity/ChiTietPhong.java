package com.example.duan_tn_booking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ChiTietPhong")
public class ChiTietPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

    @Column(name = "so_luong")
    private String soLuong;

    @Column(name = "gia")
    private Long gia;

    @Column(name = "trangThai")
    private Boolean trangThai;

    @ManyToOne
    @JoinColumn(name = "id_phong",referencedColumnName = "id_phong")
    private Phong phong;

    @ManyToOne
    @JoinColumn(name = "id_tang",referencedColumnName = "id_tang")
    private Tang tang;

    @ManyToOne
    @JoinColumn(name = "id_dien_tich",referencedColumnName = "id_dien_tich")
    private DienTichPhong dienTichPhong;

    @OneToMany
    @JoinColumn(name = "setCTDatPhong")
    private Set<ChiTietDatPhong> chiTietDatPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setDanhGia")
    private Set<DanhGia> setDanhGias = new HashSet<>();
}
