package com.se.springbootdemocrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.se.springbootdemocrud.entity.ChuyenBay;

public interface ChuyenBayDao {

	List<ChuyenBay> findCBDuocLaiBoiBoeing();

	List<Object[]> countDiaDiemKhoiHanhTruoc12h();

	List<ChuyenBay> findCBKHTruoc12h();

	List<Object[]> tongChiPhiPhaiTra();

	List<Object[]> countChuyenBayKhoiHanh();

	List<ChuyenBay> findDBFromAtoBAndToA();

	List<ChuyenBay> findCBByMBAirbusA320();

	int sumCBFromSG();

	List<ChuyenBay> findBySGtoBMT();

	List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000();

	List<ChuyenBay> findByGaDen(String gaDen);



	List<ChuyenBay> getDsChuyenBay();

	Optional<ChuyenBay> getChuyenBayById(String id);

	ChuyenBay createChuyenBay(ChuyenBay chuyenBay);

	String deleteChuyenBay(String id);



	
}
