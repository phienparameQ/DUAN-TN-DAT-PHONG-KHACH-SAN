package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PhongTienIch")
public class PhongTienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phong_tien_ich")
    private Integer idPhongTienIch;

    @Column(name = "id_phong")
    private Integer idPhong;

    @ManyToOne
    @JoinColumn(name = "id_tien_ich_phong",referencedColumnName = "id_tien_ich_phong")
    private TienIchPhong tienIchPhong;

    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

}
