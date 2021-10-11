package com.example.demo;

import com.example.demo.ExternalSource.ExternalSource;
import com.example.demo.device.Device;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {
	static Map<String, Device> deviceList = new HashMap<String, Device>();
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public String getStatus(String deviceId){
		Device device = deviceList.get(deviceId);
		String result = "";
		if(device instanceof ExternalSource){
			((ExternalSource) device).printPowerStatus();
		}

		return "";
	}

}
