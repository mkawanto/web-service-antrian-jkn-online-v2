package com.hermina.bpjs_api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

public class ParamKodeBooking {
	 @ApiModelProperty(notes = "Booking Code", name="kodebooking",value="kodebooking", example="16032021A001", required = true)
	 @NotEmpty(message = "kodebooking is mandatory")
	 @NotBlank(message = "kodebooking is required")
	 private String kodebooking;

	/**
	 * @param kodebooking
	 */
	 public ParamKodeBooking() {}
	public ParamKodeBooking(String kodebooking) {
		
		this.kodebooking = kodebooking;
	}


	public String getKodebooking() {
		return kodebooking;
	}

	public void setKodebooking(String kodebooking) {
	
		this.kodebooking = kodebooking;
	}

    	
	 
 
	 
	 
}
