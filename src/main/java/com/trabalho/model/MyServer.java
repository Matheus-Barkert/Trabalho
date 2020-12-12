package com.trabalho.model;

import lombok.Getter;

@Getter
public class MyServer {
	
	private String serverName;
	
	public MyServer(String serverName) {
		this.serverName = serverName;
	}

}
