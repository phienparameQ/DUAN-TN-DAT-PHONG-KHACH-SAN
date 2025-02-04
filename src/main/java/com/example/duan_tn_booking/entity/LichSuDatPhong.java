package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LichSuDatPhong")
public class LichSuDatPhong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLSDP")
    private Integer idLsdp;

    @Column(name = "thoi_gian_thay_doi")
    private LocalDateTime thoiGianThayDoi;

    @Column(name = "chi_tiet_thay_doi")
    private String chiTietThayDoi;

    @ManyToOne
    @JoinColumn(name = "id_dat_phong",referencedColumnName = "id_dat_phong")
    private DatPhong datPhong;


}
