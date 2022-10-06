package com.se.springbootdemocrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.springbootdemocrud.responsitory.MayBayRespository;

@Service
public class MayBayServiceImpl implements MayBayService {
	@Autowired
	private MayBayRespository mayBayRespository;
	
	@Override
	public List<String> findByTamBayLonHon10000() {
		// TODO Auto-generated method stub
		return mayBayRespository.findByTamBayLonHon10000();
	}

	@Override
	public int sumMayBayBoeing() {
		// TODO Auto-generated method stub
		return mayBayRespository.sumMayBayBoeing();
	}

	@Override
	public List<String> findMaByNameNguyen() {
		// TODO Auto-generated method stub
		return mayBayRespository.findMaByNameNguyen();
	}

	@Override
	public List<Object[]> findMaLoaiVaTongPhiCong(){
		// TODO Auto-generated method stub
		return mayBayRespository.findMaLoaiVaTongPhiCong();
	}

	@Override
	public List<String> findLoaiByCBVN280() {
		// TODO Auto-generated method stub
		return mayBayRespository.findLoaiByCBVN280();
	}



}
