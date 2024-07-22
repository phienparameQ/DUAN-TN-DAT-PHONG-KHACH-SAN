package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LichLamViec")
public class LichLamViec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lich_lam_viec")
    private Integer idLichLamViec;

    @Column(name = "ma_lich_lam_viec")
    private String maLichLamViec;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien",referencedColumnName = "id_nhan_vien")
    private NhanVien nhanVien;

    @Column(name = "ngay")
    private Date ngay;

    @Column(name = "giao_ca")
    private LocalDateTime giaoCa;

}
