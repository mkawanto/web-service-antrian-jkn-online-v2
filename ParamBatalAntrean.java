package com.hermina.bpjs_api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

public class ParamBatalAntrean {
	 
	 @ApiModelProperty(notes = "Booking Code", name="kodebooking",value="kodebooking", example="16032021A001", required = true)
	 @NotEmpty(message = "kodebooking is mandatory")
	 @NotBlank(message = "kodebooking is required")
	 private String kodebooking;
	 @ApiModelProperty(notes = "Information", name="keterangan",value="keterangan", example="Terjadi perubahan jadwal dokter, silahkan daftar kembali", required = true)
	 @NotEmpty(message = "keterangan is mandatory")
	 @NotBlank(message = "keterangan is required")
	 private String keterangan;
	/**
	 * @param kodebooking
	 * @param keterangan
	 */
	public ParamBatalAntrean(String kodebooking, String keterangan) {
		this.kodebooking = kodebooking;
		this.keterangan = keterangan;
	}
	public String getKodebooking() {
		return kodebooking;
	}
	public void setKodebooking(String kodebooking) {
		this.kodebooking = kodebooking;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	 
	 

}
