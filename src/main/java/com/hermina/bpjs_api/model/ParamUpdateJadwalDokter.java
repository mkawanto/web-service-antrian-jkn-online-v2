package com.hermina.bpjs_api.model;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

public class ParamUpdateJadwalDokter {
	@ApiModelProperty(notes = "Polyclinic Code", name="kodepoli",value="kodepoli: from BPJS data master", example="ANA", required = true)
	@NotEmpty(message = "kodepoli is mandatory")
	private String kodepoli;
	@ApiModelProperty(notes = "Specialist Code", name="kodesubspesialis",value="kodesubspesialis: from BPJS data master", example="ANA", required = true)
	@NotEmpty(message = "kodesubspesialis is mandatory")
	private String kodesubspesialis;
	@ApiModelProperty(notes = "Specialist Code", name="kodesubspesialis",value="kodesubspesialis", example="12346", required = true)
	@NotEmpty(message = "kodedokter is mandatory")
	private String kodedokter;
	private JadwalHari[] jadwal;
	
	/**
	 * @param kodepoli
	 * @param kodesubspesialis
	 * @param kodedokter
	 */
	public ParamUpdateJadwalDokter(String kodepoli, String kodesubspesialis, String kodedokter) {
		this.kodepoli = kodepoli;
		this.kodesubspesialis = kodesubspesialis;
		this.kodedokter = kodedokter;
	}
	public String getKodepoli() {
		return kodepoli;
	}
	public void setKodepoli(String kodepoli) {
		this.kodepoli = kodepoli;
	}
	public String getKodesubspesialis() {
		return kodesubspesialis;
	}
	public void setKodesubspesialis(String kodesubspesialis) {
		this.kodesubspesialis = kodesubspesialis;
	}
	public String getKodedokter() {
		return kodedokter;
	}
	public void setKodedokter(String kodedokter) {
		this.kodedokter = kodedokter;
	}
	public JadwalHari[] getJadwal() {
		return jadwal;
	}
	public void setJadwal(JadwalHari[] jadwal) {
		this.jadwal = jadwal;
	}
	

}
