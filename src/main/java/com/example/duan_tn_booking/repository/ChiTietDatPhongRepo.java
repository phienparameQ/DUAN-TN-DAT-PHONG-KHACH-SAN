package com.example.duan_tn_booking.repository;

import com.example.duan_tn_booking.entity.ChiTietDatPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDatPhongRepo extends JpaRepository<ChiTietDatPhong,Integer> {
}
