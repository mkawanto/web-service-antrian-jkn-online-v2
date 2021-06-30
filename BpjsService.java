package com.hermina.bpjs_api.service;



import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hermina.bpjs_api.model.ParamBatalAntrean;
import com.hermina.bpjs_api.model.ParamKodeBooking;
import com.hermina.bpjs_api.model.ParamTambahAntrian;
import com.hermina.bpjs_api.model.ParamUpdateJadwalDokter;
import com.hermina.bpjs_api.model.ParamUpdateWaktuAntrean;

@Service
public class BpjsService {
	
	@Autowired
	ExtractHttpRequestHeaderService url;

	public Object tambahAntrian(HttpHeaders header, ParamTambahAntrian request) {
		try {
			
			RestTemplate restTemplate = new RestTemplate();
						
			HttpEntity<ParamTambahAntrian> entity = new HttpEntity<ParamTambahAntrian>(request ,header);
			return restTemplate.exchange( url.getUrl().toString() + "/arsws/rest/v2/antrean/add", HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			return e;
		}
		
	}
	
	public Object updateWaktuAntrian(HttpHeaders header, ParamUpdateWaktuAntrean updateWaktuAntrian) {
		
		try {
			
			RestTemplate restTemplate = new RestTemplate();
						
			HttpEntity<ParamUpdateWaktuAntrean> entity = new HttpEntity<ParamUpdateWaktuAntrean>(updateWaktuAntrian, header);
			return restTemplate.exchange( url.getUrl().toString() + "/arsws/rest/v2/antrean/updatewaktu", HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			return e;
		}
		
	}
	
	public Object batalAntrean(HttpHeaders header, ParamBatalAntrean batalAntrian) {
	    
		try {
		
			RestTemplate restTemplate = new RestTemplate();			
			HttpEntity<ParamBatalAntrean> entity = new HttpEntity<>(batalAntrian ,header);
			//System.out.println(entity);
			
			return restTemplate.exchange( url.getUrl().toString() + "/arsws/rest/v2/antrean/batal", HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Error");
			return e;
		}
	}
	
	public Object updateJadwalDokter(HttpHeaders header,ParamUpdateJadwalDokter updateJadwalDokter) {
		try {
			
			RestTemplate restTemplate = new RestTemplate();
						
			HttpEntity<ParamUpdateJadwalDokter> entity = new HttpEntity<ParamUpdateJadwalDokter>(updateJadwalDokter ,header);
			
					
			return restTemplate.exchange( url.getUrl().toString() + "/arsws/rest/v1/jadwaldokter/updatejadwaldokter", HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			return e;
		}
		
	}
	
    public Object jadwalDokter(HttpHeaders header,String kodePoli, LocalDate tanggal) {
    	try {
			
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<Object> entity = new HttpEntity<>(header);

			return restTemplate.exchange( url.getUrl().toString() +"/arsws/rest/v1/jadwaldokter/kodepoli/"+kodePoli+"/tanggal/"+tanggal, HttpMethod.GET, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			return e;
		}
		
	}
    
    public Object getListTask(HttpHeaders header, ParamKodeBooking kodeBooking) {
    	try {
    		
			RestTemplate restTemplate = new RestTemplate();
						
			HttpEntity<ParamKodeBooking> entity = new HttpEntity<ParamKodeBooking>(kodeBooking,header);
			
			
			//return entity;
			return restTemplate.exchange( url.getUrl().toString() + "/arsws/rest/v2/antrean/getlisttask", HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			// TODO: handle exception
			return e;
		}
    	//return kodeBooking;
    }
}
