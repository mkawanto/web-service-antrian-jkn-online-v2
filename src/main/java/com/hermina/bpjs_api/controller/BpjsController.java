package com.hermina.bpjs_api.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hermina.bpjs_api.model.ParamBatalAntrean;
import com.hermina.bpjs_api.model.ParamKodeBooking;
import com.hermina.bpjs_api.model.ParamTambahAntrian;
import com.hermina.bpjs_api.model.ParamUpdateJadwalDokter;
import com.hermina.bpjs_api.model.ParamUpdateWaktuAntrean;
import com.hermina.bpjs_api.service.BpjsService;
import com.hermina.bpjs_api.service.ExtractHttpRequestHeaderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "REST Apis related to Antrian JKN Online versi 2")
@RestController
public class BpjsController {

	@Autowired
	private BpjsService service;

	@Autowired
	private ExtractHttpRequestHeaderService extractRequestService;

	@ApiOperation(value = "to Add Appointment or Booking to BPJS", response = ParamTambahAntrian.class)
	@PostMapping("/tambahantrian")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	@Validated
	public Object tambahAntrian(@Valid @RequestBody ParamTambahAntrian tambahAntrian, HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);
		return service.tambahAntrian(extractHttp, tambahAntrian);
	}

	@ApiOperation(value = "to update Queue Time", response = ParamUpdateWaktuAntrean.class)
	@PostMapping("/updatewaktuantrian")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	@Validated
	public Object updateWaktuAntrian(@Valid @RequestBody ParamUpdateWaktuAntrean waktuAntrean,
			HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);
		return service.updateWaktuAntrian(extractHttp, waktuAntrean);
	}

	/* End Point Pembatalan Antrian */
	@ApiOperation(value = "to cancel Appointment or Booking", response = ParamBatalAntrean.class)
	@PostMapping("/batalantrian")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	@Validated
	public Object batalAntrian(@Valid @RequestBody ParamBatalAntrean batalAntrean, HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);

		return service.batalAntrean(extractHttp, batalAntrean);
	}

	@ApiOperation(value = "to update Doctor Consultation Schedule", response = ParamUpdateJadwalDokter.class)
	@PostMapping("/updatejadwaldokter")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	@Validated
	public Object updateJadwalDokter(@Valid @RequestBody ParamUpdateJadwalDokter updateJadwalDokter,
			HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);
		return service.updateJadwalDokter(extractHttp, updateJadwalDokter);
	}

	@ApiOperation(value = "Doctor Consultation Schedule")
	@GetMapping("/getjadwaldokter/{kodePoli}/{tanggal}")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	public Object getJadwalDokter(
			@ApiParam(name = "kodePoli", type = "String", value = "Polyclinic Code", example = "ANA", required = true) @RequestParam String kodePoli,
			@ApiParam(name = "tanggal", type = "Date", value = "Consultation Date", example = "2021-06-21", required = true) @RequestParam("tanggal") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate tanggal,
			HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);
		return service.jadwalDokter(extractHttp, kodePoli, tanggal);
	}

	@ApiOperation(value = "get List Task Id")
	@PostMapping("/getlisttask")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "X-Cons-ID", paramType = "header", required = true, allowEmptyValue = false, value = "X-Cons-ID", example = "1565"),
			@ApiImplicitParam(name = "X-Timestamp", paramType = "header", required = true, allowEmptyValue = false, value = "X-Timestamp", example = "1624525985"),
			@ApiImplicitParam(name = "X-Signature", paramType = "header", required = true, allowEmptyValue = false, value = "X-Signature", example = "CHzZHTcM7Ga2JD2TheU58+Q1mJ3A7W59K1MzXpTK/D8=") })
	public Object getListTask(@RequestBody ParamKodeBooking kodeBooking, HttpServletRequest httpServlet) {

		HttpHeaders extractHttp = (HttpHeaders) extractRequestService.extracthHttp(httpServlet);
		return service.getListTask(extractHttp, kodeBooking);
	}

}
