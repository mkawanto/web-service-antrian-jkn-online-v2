package com.hermina.bpjs_api.model;

import java.time.LocalDate;
//import java.time.LocalDateTime;

import com.hermina.validation.EnumNamePattern;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TambahAntrian", description = "Adding an appointment or booking transaction to the BPJS web service")
public class ParamTambahAntrian {
		
	    @ApiModelProperty(notes="Booking Code", name="kodebooking",value="kodebooking",example="16032021A001",required=true)
	    private String kodebooking;
	    @ApiModelProperty(notes = "Patient Type", name="jenispasien",value= "Jenis Pasien: JKN, NON JKN",example="JKN" , required=true)
	    @EnumNamePattern(regexp = "JKN|NON JKN")
	    private String jenispasien;
	    @ApiModelProperty(notes = "JKN Card Number", name="nomorkartu",value = "nomorkartu",example="00012345678", required = true)
	    private String nomorkartu;
	    @ApiModelProperty(notes = "resident identification number", name="nik",value = "3212345678987654",example="3212345678987654", required = true)
	    private String nik;
	    @ApiModelProperty(notes = "mobile phone number", name="nohp",value = "nohp",example="085635228888", required = true)
	    private String nohp;
	    @ApiModelProperty(notes = "polyclinic code from BPJS", name="kodepoli",value = "kodepoli",example="ANA", required = true)
	    private String kodepoli;
	    @ApiModelProperty(notes = "polyclinic name from BPJS", name="namapoli",value = "namapoli",example="Anak", required = true)
	    private String namapoli;
	    @ApiModelProperty(notes = "New Patient Flag", name="pasienbaru",value = "Pasien Baru: 1 (Ya), 0 (Tidak)",example="1", required = true)
	    private String pasienbaru;
	    @ApiModelProperty(notes = "Medical Record Number", name="norm",value = "norm",example="123345", required = true)
	    private String norm;
	    @ApiModelProperty(notes = "Consultation Date", name="tanggalperiksa",value = "tanggalperiksa yyyy-mm-dd" ,example="2021-06-21", required = true)
	    private LocalDate tanggalperiksa;
	    @ApiModelProperty(notes = "Doctor Code from BPJS", name="kodedokter",value = "kodedokter",example="H0234", required = true)
	    private String kodedokter;
	    @ApiModelProperty(notes = "Doctor Name from BPJS", name="namadokter",value = "namadokter",example="dr Hendra", required = true)
	    private String namadokter;
	    @ApiModelProperty(notes = "Consultation Schedule Time", name="jampraktek",value = "jampraktek",example="08:00-16:00", required = true)
	    private String jampraktek;
	    @ApiModelProperty(notes = "Type of Visit", name="jeniskunjungan",value = "- Jenis Kunjungan: \r\n"
	    		+ "1 (Rujukan FKTP), \r\n"
	    		+ "2 (Rujukan Internal), \r\n"
	    		+ "3 (Kontrol), \r\n"
	    		+ "4 (Rujukan Antar RS),\r\n"
	    		+ "", example="1", required = true)
	    @EnumNamePattern(regexp = "1|2|3|4")
	    private String jeniskunjungan;
	    @ApiModelProperty(notes = "Reference Number", name="nomorreferensi",value = "nomorreferensi",example="0001R0040116A000001", required = true)
	    private String nomorreferensi;
	    @ApiModelProperty(notes = "Queue Number String", name="nomorantrean",value = "nomorantrean",example="A-12", required = true)
	    private String nomorantrean;
	    @ApiModelProperty(notes = "Queue Number", name="angkaantrean",value = "angkaantrean",example="12", required = true)
	    private Integer angkaantrean;
	    @ApiModelProperty(notes = "estimated consultation serviced", name="estimasidilayani",value = "estimasidilayani",example="1615869169000", required = true)
	    private Long estimasidilayani;
	    @ApiModelProperty(notes = "remaining JKN quota", name="sisakuotajkn",value = "sisakuotajkn",example="5", required = true)
	    private Integer sisakuotajkn;
	    @ApiModelProperty(notes = "JKN quota", name="kuotajkn",value = "kuotajkn",example="30", required = true)
	    private Integer kuotajkn;
	    @ApiModelProperty(notes = "remaining Non JKN quota", name="sisakuotanonjkn",value = "sisakuotanonjkn",example="30", required = true)
	    private Integer sisakuotanonjkn;
	    @ApiModelProperty(notes = "Non JKN quota", name="kuotanonjkn",value = "kuotanonjkn",example="30", required = true)
	    private Integer kuotanonjkn;
	    @ApiModelProperty(notes = "Information", name="keterangan",value="keterangan", example="Peserta harap 30 menit lebih awal guna pencatatan administrasi.", required = true)
	    private String keterangan;
		/**
		 * @param kodebooking
		 * @param jenispasien
		 * @param nomorkartu
		 * @param nik
		 * @param nohp
		 * @param kodepoli
		 * @param namapoli
		 * @param pasienbaru
		 * @param norm
		 * @param tanggalperiksa
		 * @param kodedokter
		 * @param namadokter
		 * @param jampraktek
		 * @param jeniskunjungan
		 * @param nomorreferensi
		 * @param nomorantrean
		 * @param angkaantrean
		 * @param estimasidilayani
		 * @param sisakuotajkn
		 * @param kuotajkn
		 * @param sisakuotanonjkn
		 * @param kuotanonjkn
		 * @param keterangan
		 */
		public ParamTambahAntrian(String kodebooking, String jenispasien, String nomorkartu, String nik,
				String nohp, String kodepoli, String namapoli, String pasienbaru, String norm, LocalDate tanggalperiksa,
				String kodedokter, String namadokter, String jampraktek, String jeniskunjungan, String nomorreferensi,
				String nomorantrean, Integer angkaantrean, Long estimasidilayani, Integer sisakuotajkn,
				Integer kuotajkn, Integer sisakuotanonjkn, Integer kuotanonjkn, String keterangan) {
			this.kodebooking = kodebooking;
			this.jenispasien = jenispasien;
			this.nomorkartu = nomorkartu;
			this.nik = nik;
			this.nohp = nohp;
			this.kodepoli = kodepoli;
			this.namapoli = namapoli;
			this.pasienbaru = pasienbaru;
			this.norm = norm;
			this.tanggalperiksa = tanggalperiksa;
			this.kodedokter = kodedokter;
			this.namadokter = namadokter;
			this.jampraktek = jampraktek;
			this.jeniskunjungan = jeniskunjungan;
			this.nomorreferensi = nomorreferensi;
			this.nomorantrean = nomorantrean;
			this.angkaantrean = angkaantrean;
			this.estimasidilayani = estimasidilayani;
			this.sisakuotajkn = sisakuotajkn;
			this.kuotajkn = kuotajkn;
			this.sisakuotanonjkn = sisakuotanonjkn;
			this.kuotanonjkn = kuotanonjkn;
			this.keterangan = keterangan;
		}
		public String getKodebooking() {
			return kodebooking;
		}
		public void setKodebooking(String kodebooking) {
			this.kodebooking = kodebooking;
		}
		public String getJenispasien() {
			return jenispasien;
		}
		public void setJenispasien(String jenispasien) {
			this.jenispasien = jenispasien;
		}
		public String getNomorkartu() {
			return nomorkartu;
		}
		public void setNomorkartu(String nomorkartu) {
			this.nomorkartu = nomorkartu;
		}
		public String getNik() {
			return nik;
		}
		public void setNik(String nik) {
			this.nik = nik;
		}
		public String getNohp() {
			return nohp;
		}
		public void setNohp(String nohp) {
			this.nohp = nohp;
		}
		public String getKodepoli() {
			return kodepoli;
		}
		public void setKodepoli(String kodepoli) {
			this.kodepoli = kodepoli;
		}
		public String getNamapoli() {
			return namapoli;
		}
		public void setNamapoli(String namapoli) {
			this.namapoli = namapoli;
		}
		public String getPasienbaru() {
			return pasienbaru;
		}
		public void setPasienbaru(String pasienbaru) {
			this.pasienbaru = pasienbaru;
		}
		public String getNorm() {
			return norm;
		}
		public void setNorm(String norm) {
			this.norm = norm;
		}
		public LocalDate getTanggalperiksa() {
			return tanggalperiksa;
		}
		public void setTanggalperiksa(LocalDate tanggalperiksa) {
			this.tanggalperiksa = tanggalperiksa;
		}
		public String getKodedokter() {
			return kodedokter;
		}
		public void setKodedokter(String kodedokter) {
			this.kodedokter = kodedokter;
		}
		public String getNamadokter() {
			return namadokter;
		}
		public void setNamadokter(String namadokter) {
			this.namadokter = namadokter;
		}
		public String getJampraktek() {
			return jampraktek;
		}
		public void setJampraktek(String jampraktek) {
			this.jampraktek = jampraktek;
		}
		public String getJeniskunjungan() {
			return jeniskunjungan;
		}
		public void setJeniskunjungan(String jeniskunjungan) {
			this.jeniskunjungan = jeniskunjungan;
		}
		public String getNomorreferensi() {
			return nomorreferensi;
		}
		public void setNomorreferensi(String nomorreferensi) {
			this.nomorreferensi = nomorreferensi;
		}
		public String getNomorantrean() {
			return nomorantrean;
		}
		public void setNomorantrean(String nomorantrean) {
			this.nomorantrean = nomorantrean;
		}
		public Integer getAngkaantrean() {
			return angkaantrean;
		}
		public void setAngkaantrean(Integer angkaantrean) {
			this.angkaantrean = angkaantrean;
		}
		public Long getEstimasidilayani() {
			return estimasidilayani;
		}
		public void setEstimasidilayani(Long estimasidilayani) {
			this.estimasidilayani = estimasidilayani;
		}
		public Integer getSisakuotajkn() {
			return sisakuotajkn;
		}
		public void setSisakuotajkn(Integer sisakuotajkn) {
			this.sisakuotajkn = sisakuotajkn;
		}
		public Integer getKuotajkn() {
			return kuotajkn;
		}
		public void setKuotajkn(Integer kuotajkn) {
			this.kuotajkn = kuotajkn;
		}
		public Integer getSisakuotanonjkn() {
			return sisakuotanonjkn;
		}
		public void setSisakuotanonjkn(Integer sisakuotanonjkn) {
			this.sisakuotanonjkn = sisakuotanonjkn;
		}
		public Integer getKuotanonjkn() {
			return kuotanonjkn;
		}
		public void setKuotanonjkn(Integer kuotanonjkn) {
			this.kuotanonjkn = kuotanonjkn;
		}
		public String getKeterangan() {
			return keterangan;
		}
		public void setKeterangan(String keterangan) {
			this.keterangan = keterangan;
		}
		
		
	    
}
