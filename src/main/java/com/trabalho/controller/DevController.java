package com.trabalho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.Grupo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Grupo")
@RestController
@RequestMapping("/dev")
public class DevController {
	
	@GetMapping
	@ApiOperation(value = "Retorna os integrantes do grupo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao buscar pelos integrantes do grupo") })
	public ResponseEntity<Grupo> getDevs() {
		return new ResponseEntity<>(new Grupo(), HttpStatus.OK);
	}

}
