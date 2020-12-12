package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.MyServer;
import com.trabalho.service.ServerService;

import io.swagger.annotations.Api;

@Api(tags = "Informações do Server")
@RestController
@RequestMapping("/quem")
public class ServerController {
	
	private final ServerService serverService;
	
	public ServerController(ServerService serverService) {
		this.serverService = serverService;
	}
	
	@GetMapping
	public ResponseEntity<MyServer> getServerName() {
		MyServer myServer = serverService.getServerName();
		return new ResponseEntity<>(myServer, HttpStatus.OK);
	}

}
