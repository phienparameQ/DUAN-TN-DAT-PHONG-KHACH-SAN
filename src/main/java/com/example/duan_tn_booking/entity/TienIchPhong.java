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
@Table(name = "TienIchPhong")
public class TienIchPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tien_ich_phong")
    private Integer idTienIchPhong;

    @Column(name = "ma_tien_ich")
    private String maTienIch;

    @Column(name = "ten_tien_ich")
    private String tenTienIch;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @OneToMany
    @JoinColumn(name = "setPhongTienIch")
    private Set<PhongTienIch> phongTienIches = new HashSet<>();

}
