package com.trabalho.controller;

import java.net.SocketException;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.IpAddress;
import com.trabalho.model.MacAddress;
import com.trabalho.service.NetworkService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Rede")
@RestController
@RequestMapping
public class NetworkController {

	private final NetworkService networkService;

	public NetworkController(NetworkService networkService) {
		this.networkService = networkService;
	}

	@GetMapping("/ip")
	@ApiOperation(value = "Retorna o endereço de ip do servidor")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Sucesso ao obter o endereço de ip"),
			@ApiResponse(code = 500, message = "O servidor não conseguiu realizar a sua requisição") })
	public ResponseEntity<IpAddress> getIp() throws UnknownHostException {
		IpAddress ipAddress = networkService.getIpAddress();
		return new ResponseEntity<>(ipAddress, HttpStatus.OK);
	}

	@GetMapping("/mac")
	@ApiOperation(value = "Retorna o mac do servidor")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Sucesso ao obter o mac"),
			@ApiResponse(code = 500, message = "O servidor não conseguiu realizar a sua requisição") })
	public ResponseEntity<MacAddress> getMac() throws SocketException {
		MacAddress macAddress = networkService.getMacAddress();
		return new ResponseEntity<>(macAddress, HttpStatus.OK);
	}
	
}
