package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.MyServer;
import com.trabalho.service.ServerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Server")
@RestController
@RequestMapping("/quem")
public class ServerController {
	
	private final ServerService serverService;
	
	public ServerController(ServerService serverService) {
		this.serverService = serverService;
	}
	
	@GetMapping
	@ApiOperation(value = "Retorna o nome do servidor")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao obter o nome do servidor") })
	public ResponseEntity<MyServer> getServerName() {
		MyServer myServer = serverService.getServerName();
		return new ResponseEntity<>(myServer, HttpStatus.OK);
	}

}
