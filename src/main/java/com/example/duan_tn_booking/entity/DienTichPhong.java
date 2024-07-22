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
@Table(name = "DienTichPhong")
public class DienTichPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dien_tich")
    private Integer idDienTich;

    @Column(name = "dien_tich")
    private Float dienTich;

    @Column(name = "mo_ta")
    private String moTa;

    @OneToMany
    @JoinColumn(name = "setCTPhong")
    private Set<ChiTietPhong> chiTietPhongs = new HashSet<>();
}
