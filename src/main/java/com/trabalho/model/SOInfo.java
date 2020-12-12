package com.trabalho.model;

import lombok.Getter;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@Getter
public class SOInfo {
	
	private String soName;
	private String soVersion;
	private String soArch;
	private int soProcessors;
	
	public SOInfo() {
		OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		this.soName = operatingSystemMXBean.getName();
		this.soVersion = operatingSystemMXBean.getVersion();
		this.soArch = operatingSystemMXBean.getArch();
		this.soProcessors = operatingSystemMXBean.getAvailableProcessors();
	}

}
