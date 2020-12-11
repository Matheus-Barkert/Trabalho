package com.trabalho.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.IpAddress;

@RestController
@RequestMapping
public class NetworkController {
	
	private static final String ip = InetAddress.getLoopbackAddress().getHostAddress();

	@GetMapping("/ip")
	public ResponseEntity<IpAddress> getIp() throws UnknownHostException {
		IpAddress ipAddress = new IpAddress(); 
		ipAddress.setIp(ip);
		return new ResponseEntity<>(ipAddress, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<String> getMac() {
		
		return null;
	}
}
