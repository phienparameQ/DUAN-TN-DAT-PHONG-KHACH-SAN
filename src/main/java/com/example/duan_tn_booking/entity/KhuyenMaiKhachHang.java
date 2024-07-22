package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KhuyenMaiKhachHang")
public class KhuyenMaiKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kmkh")
    private Integer idKmkh;

    @Column(name = "ngay_tham_gia")
    private Date ngayThamGia;

    @ManyToOne
    @JoinColumn(name = "id_khuyen_mai",referencedColumnName = "id_khuyen_mai")
    private KhuyenMai khuyenMai;

    @Column(name = "id_khach_hang")
    private Integer idKhachHang;

}
