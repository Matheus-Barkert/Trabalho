package com.trabalho.service;

import org.apache.catalina.util.ServerInfo;
import org.springframework.stereotype.Service;

import com.trabalho.model.MyServer;

@Service
public class ServerService {
	
	public MyServer getServerName() {
		MyServer myServer = new MyServer(ServerInfo.getServerInfo());
		return myServer;
	}

}
