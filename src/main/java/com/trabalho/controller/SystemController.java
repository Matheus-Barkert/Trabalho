package com.trabalho.controller;

import java.util.Properties;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.model.SOInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Informações do sistema")
@RestController
@RequestMapping
public class SystemController {
	
	@GetMapping("/info")
	@ApiOperation(value = "Retorna o várias informações do sistema")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao obter informações do sistema") })
	public ResponseEntity<Properties> getInfos() {	
		return new ResponseEntity<>(System.getProperties(), HttpStatus.OK);
	}
	
	@GetMapping("/sys")
	@ApiOperation(value = "Retorna informações do sistema operacional")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucesso ao obter informações do sistema operacional") })
	public ResponseEntity<SOInfo> getSOInfo() {
		return null;
	}

}
