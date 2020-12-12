package com.trabalho.controller;

import java.net.InetAddress;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.IpAddress;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Informações de rede")
@RestController
@RequestMapping
public class NetworkController {

	private static final String IP = InetAddress.getLoopbackAddress().getHostAddress();

	@GetMapping("/ip")
	@ApiOperation(value = "Retorna o endereço de ip do servidor")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao obter o endereço de ip") })
	public ResponseEntity<IpAddress> getIp() {
		IpAddress ipAddress = new IpAddress();
		ipAddress.setIp(IP);
		return new ResponseEntity<>(ipAddress, HttpStatus.OK);
	}

	@GetMapping("/mac")
	@ApiOperation(value = "Retorna o mac do servidor")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao obter o mac") })
	public ResponseEntity<String> getMac() {
		
		return null;
	}
}
