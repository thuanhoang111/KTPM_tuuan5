package com.se.springbootdemocrud.entity;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MaCB")
	private String maCB;
	
	@Column(name = "GaDi")
	private String gaDi;
	
	@Column(name = "GaDen")
	private String gaDen;
	
	@Column(name = "DoDai")
	private int doDai;
	
	@Column(name = "GioDi")
	private Date gioDi;
	
	@Column(name = "GioDen")
	private Date gioDen;
	
	@Column(name = "ChiPhi")
	private int chiPhi;

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

	
	
	
}
