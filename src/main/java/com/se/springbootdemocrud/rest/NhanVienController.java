package com.se.springbootdemocrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.NhanVienService;
import com.se.springbootdemocrud.entity.NhanVien;

@RestController
@RequestMapping("")
public class NhanVienController {

	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/nhanvien/findByLuongNhoHon10000")
	public List<NhanVien> findByLuongNhoHon10000(){
		return nhanVienService.findByLuongNhoHon10000();
	}
}
