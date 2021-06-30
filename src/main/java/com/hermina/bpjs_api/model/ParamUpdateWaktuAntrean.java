package com.hermina.bpjs_api.model;

import com.hermina.validation.EnumNamePattern;

//import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;

public class ParamUpdateWaktuAntrean {
	
	@ApiModelProperty(notes = "Booking Code", name="kodebooking",value="kodebooking", example="16032021A001", required = true)
	private String kodebooking;
	@ApiModelProperty(notes = "Task Code", name="taskid",value="Task ID = \r\n"
			+ "1 (mulai waktu tunggu admisi), \r\n"
			+ "2 (akhir waktu tunggu admisi/mulai waktu layan admisi), \r\n"
			+ "3 (akhir waktu layan admisi/mulai waktu tunggu poli), \r\n"
			+ "4 (akhir waktu tunggu poli/mulai waktu layan poli),  \r\n"
			+ "5 (akhir waktu layan poli/mulai waktu tunggu farmasi), \r\n"
			+ "6 (akhir waktu tunggu farmasi/mulai waktu layan farmasi membuat obat), \r\n"
			+ "7 (akhir waktu obat selesai dibuat),\r\n"
			+ "99 (tidak hadir/batal)", example="1", required = true)
	@EnumNamePattern(regexp = "1|2|3|4|5|6|7|99")
	private String taskid;
	@ApiModelProperty(notes = "Hours", name="waktu",value="waktu: timestamp in milisecond UTC Unix time", example="1616559330000", required = true)
	private Long waktu; 
	/**
	 * @param kodebooking
	 * @param taskid
	 * @param waktu
	 */
	public ParamUpdateWaktuAntrean(String kodebooking, String taskid, Long waktu) {
		this.kodebooking = kodebooking;
		this.taskid = taskid;
		this.waktu = waktu;
	}
	public String getKodebooking() {
		return kodebooking;
	}
	public void setKodebooking(String kodebooking) {
		this.kodebooking = kodebooking;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public Long getWaktu() {
		return waktu;
	}
	public void setWaktu(Long waktu) {
		this.waktu = waktu;
	}
	
	

}
