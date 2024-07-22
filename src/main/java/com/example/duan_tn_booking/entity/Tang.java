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
@Table(name = "Tang")
public class Tang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tang")
    private Integer idTang;

    @Column(name = "ten_tang")
    private String tenTang;

    @Column(name = "mo_ta")
    private String moTa;

    @OneToMany
    @JoinColumn(name = "setCTPhong")
    private Set<ChiTietPhong> chiTietPhongs = new HashSet<>();
}
