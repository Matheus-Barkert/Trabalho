package com.trabalho.service;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import org.springframework.stereotype.Service;

import com.trabalho.model.IpAddress;
import com.trabalho.model.MacAddress;

@Service
public class NetworkService {

	private final InetAddress localHost;

	public NetworkService(InetAddress localHost) {
		this.localHost = localHost;
	}

	public IpAddress getIpAddress() {
		return new IpAddress(localHost.getHostAddress());
	}

	// FIXME ainda preciso fazer uma implementacao funcional para o mac e revisar o
	// ip
	public MacAddress getMacAddress() throws SocketException {

		final Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
		while (e.hasMoreElements()) {
			final byte[] mac = e.nextElement().getHardwareAddress();
			if (mac != null) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < mac.length; i++)
					sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
				return new MacAddress(sb.toString());
			}
		}
		throw new SocketException();
	}
}
