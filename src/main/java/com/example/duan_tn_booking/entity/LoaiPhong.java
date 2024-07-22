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
@Table(name = "LoaiPhong")
public class LoaiPhong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loai_phong")
    private Integer idLoaiPhong;

    @Column(name = "ma_loai_phong")
    private String maLoaiPhong;

    @Column(name = "ten_loai_phong")
    private String tenLoaiPhong;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_giuong")
    private Integer soLuongGiuong;

    @Column(name = "so_nguoi_toi_da")
    private Integer soNguoiToiDa;

    @Column(name = "gia")
    private Float gia;

    @OneToMany
    @JoinColumn(name = "setPhong")
    private Set<Phong> phongs = new HashSet<>();

}
