package com.se.springbootdemocrud.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.se.springbootdemocrud.entity.ChuyenBay;
import com.se.springbootdemocrud.responsitory.ChuyenBayResponsitory;

@Service
public class ChuyenBayDaoImpl implements ChuyenBayDao {

	@Autowired 
	private ChuyenBayResponsitory chuyenBayRespository;
	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByDoDaiDBNhoHon10000VaLoHon8000();
	}

	@Override
	public List<ChuyenBay> findBySGtoBMT() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findBySGtoBMT();
	}

	@Override
	public int sumCBFromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.sumCBFromSG();
	}

	@Override
	public List<ChuyenBay> findCBByMBAirbusA320() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBByMBAirbusA320();
	}

	@Override
	public List<ChuyenBay> findDBFromAtoBAndToA() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findDBFromAtoBAndToA();
	}

	@Override
	public List<Object[]> countChuyenBayKhoiHanh() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.countChuyenBayKhoiHanh();
	}

	@Override
	public List<Object[]> tongChiPhiPhaiTra() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.tongChiPhiPhaiTra();
	}

	@Override
	public List<ChuyenBay> findCBKHTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBKHTruoc12h();
	}

	@Override
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.countDiaDiemKhoiHanhTruoc12h();
	}

	@Override
	public List<ChuyenBay> findCBDuocLaiBoiBoeing() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBDuocLaiBoiBoeing();
	}

	@Override
	public List<ChuyenBay> getDsChuyenBay() {
		return chuyenBayRespository.findAll();
	}

	@Override
	public Optional<ChuyenBay> getChuyenBayById(String id) {
		 Optional<ChuyenBay> chuyenbay = chuyenBayRespository.findById(id);
		 return chuyenbay;
		
	}

	@Override
	public ChuyenBay createChuyenBay(ChuyenBay chuyenBay) {
		chuyenBayRespository.save(chuyenBay);
		return chuyenBay;
	}

	@Override
	public String deleteChuyenBay(String id) {
		chuyenBayRespository.deleteById(id);
		return "xóa thành công";
	}



}
