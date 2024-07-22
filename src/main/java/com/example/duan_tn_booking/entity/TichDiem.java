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
@Table(name = "TichDiem")
public class TichDiem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tich_diem")
    private Integer idTichDiem;

    @Column(name = "diem_so")
    private Integer diemSo;

    @Column(name = "ngay_cap_nhap")
    private Date ngayCapNhap;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang",referencedColumnName = "id_khach_hang")
    private KhachHang khachHang;


}
