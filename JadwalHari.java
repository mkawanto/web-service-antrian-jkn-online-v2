package com.hermina.bpjs_api.model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

public class JadwalHari {
	
	@ApiModelProperty(notes = "Day Code", name="hari",value="*hari = \r\n"
			+ "1 (senin), \r\n"
			+ "2 (selasa), \r\n"
			+ "3 (rabu), \r\n"
			+ "4 (kamis), \r\n"
			+ "5 (jumat), \r\n"
			+ "6 (sabtu), \r\n"
			+ "7 (minggu), \r\n"
			+ "8 (hari libur nasional)", example="1", required = true)
	private String hari;
	@ApiModelProperty(notes = "Open", name="buka",value="buka : start consultation schedule time ", example= "08:00", required = true)
	@JsonFormat(pattern = "HH:mm")
	private LocalTime buka;
	@ApiModelProperty(notes = "Open", name="tutup",value="tutup : close consultation schedule time", example= "10:00", required = true)
	@JsonFormat(pattern = "HH:mm")
	private LocalTime tutup;
	
	/**
	 * @param hari
	 * @param buka
	 * @param tutup
	 */
	public JadwalHari(String hari, LocalTime buka, LocalTime tutup) {
		this.hari = hari;
		this.buka = buka;
		this.tutup = tutup;
	}

	public String getHari() {
		return hari;
	}

	public void setHari(String hari) {
		this.hari = hari;
	}

	public LocalTime getBuka() {
		return buka;
	}

	public void setBuka(LocalTime buka) {
		this.buka = buka;
	}

	public LocalTime getTutup() {
		return tutup;
	}

	public void setTutup(LocalTime tutup) {
		this.tutup = tutup;
	}
	
	

}
