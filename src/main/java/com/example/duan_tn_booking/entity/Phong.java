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
@Table(name = "Phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "ma_phong")
    private String maPhong;

    @Column(name = "ten_phong")
    private String tenPhong;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "mo_ta")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "id_loai_phong",referencedColumnName ="id_loai_phong")
    private LoaiPhong loaiPhong;

    @OneToMany
    @JoinColumn(name = "setCTPhong")
    private Set<ChiTietPhong> chiTietPhongs = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "setDatPhong")
    private Set<DatPhong> datPhongs = new HashSet<>();
}
