package com.example.duan_tn_booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QuyTac")
public class QuyTac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_quy_tac")
    private Integer idQuyTac;

    @Column(name = "ma_quy_tac")
    private String maQuyTac;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "mo_ta")
    private String moTa;

}
