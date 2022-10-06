package com.se.springbootdemocrud.dao;

import java.util.List;

import com.se.springbootdemocrud.entity.NhanVien;

public interface NhanVienService {

	int tongSoLuongPhaiTra();

	List<String> findNVMaxLuong();

	List<NhanVien> findNVKhongPhaiPhiCong();

	List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();

	List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();

	List<String> findMaNVChiLaiDuoc3LoaiMayBay();

	List<String> findTenByNVLaiBoeing();

	List<String> findMaByNVLaiBoeingVaAirbus();

	List<NhanVien> findBymaMB747();

	int sumLuong();

	List<NhanVien> findByLuongNhoHon10000();

}
