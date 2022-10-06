package com.se.springbootdemocrud.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.ChuyenBayDao;
import com.se.springbootdemocrud.entity.ChuyenBay;

@RestController
@RequestMapping("")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> findAll(){
		return chuyenBayDao.getDsChuyenBay();
	}
	@GetMapping("/chuyenbay/{ChuyenBayId}")
	public Optional<ChuyenBay> findById(@PathVariable String ChuyenBayId) {
		return chuyenBayDao.getChuyenBayById(ChuyenBayId);
	}
	/**
	 * @param chuyenBay
	 * @return
	 */
	@PostMapping("/chuyenbay")
	public ChuyenBay createChuyenBay(@RequestBody ChuyenBay chuyenBay) {
		
		System.out.println(chuyenBay);
//		Date a = chuyenBay.getGioDen();
//		chuyenBay.setGioDen(new Date());
//		chuyenBay.setGioDi(new Date(chuyenBay.getGioDi()));
		
		return chuyenBayDao.createChuyenBay(chuyenBay);
	}
	@DeleteMapping("/chuyenbay/{ChuyenBayId}")
	public String deleteChuyenBay(@PathVariable String ChuyenBayId) {
		return chuyenBayDao.deleteChuyenBay(ChuyenBayId);
	}
	@GetMapping("/chuyenbay/findbygaden/{gaDen}")
	public List<ChuyenBay> findByGaDen(@PathVariable String gaDen){
		return chuyenBayDao.findByGaDen(gaDen);
	}
	@GetMapping("/chuyenbay/findbydodai")
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000(){
		return chuyenBayDao.findByDoDaiDBNhoHon10000VaLoHon8000();
	}
}
