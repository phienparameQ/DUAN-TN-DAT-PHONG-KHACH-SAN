package com.example.duan_tn_booking.repository;

import com.example.duan_tn_booking.entity.ChamSocKhachHang;
import com.example.duan_tn_booking.entity.QuyTac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyTacRepo extends JpaRepository<QuyTac,Integer> {
}
