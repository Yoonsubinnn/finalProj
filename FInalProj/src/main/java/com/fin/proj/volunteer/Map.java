package com.fin.proj.volunteer;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Map {
	private Map() {}
	
	public static HashMap<String, Double> getLongitudeAndLatitude(String address) {
		final String API_KEY = "1d406575d6e9075005c02670b76f0612";
		String encodedAddress = null;
		URI uri = null;
		try {
			encodedAddress = URLEncoder.encode(address, "UTF-8");
			String rawURI = "https://dapi.kakao.com/v2/local/search/address.json?query=" + encodedAddress;
			uri = new URI(rawURI);
		} catch (UnsupportedEncodingException | URISyntaxException e) {
			e.printStackTrace();
		} 
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK " + API_KEY);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<String>(headers), String.class);
		
		JsonObject body = (JsonObject) JsonParser.parseString(result.getBody());
		JsonArray documents = (JsonArray)body.get("documents");
		
		JsonObject local = (JsonObject)documents.get(0);
		JsonObject addressArr = (JsonObject)local.get("address");

		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("x", Double.parseDouble(addressArr.get("x").toString().substring(1, addressArr.get("x").toString().length()-1)));
		map.put("y", Double.parseDouble(addressArr.get("y").toString().substring(1, addressArr.get("y").toString().length()-1)));
		
		return map;
	}
}
