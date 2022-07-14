package com.example.smart_marine_API.smart_marine;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.respository.PortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SmartMarineApplication implements CommandLineRunner {

	@Autowired
	PortsRepository portsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmartMarineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		portsRepository.saveAll(Arrays.asList(
				new Ports("Red Hook Terminal", 40.6840, -74.0062),
				new Ports("port of seattle", 47.6138, -122.3543),
				new Ports("port of san francisco", 37.7749, -122.4194),
				new Ports("port Hueneme", 34.1492, -119.2087),
				new Ports("Port of San Diego", 32.7355, -117.1772),
				new Ports("Port of Oakland", 37.7957, -122.2792),
				new Ports("Port of Los Angeles", 33.7292, -118.2620),
				new Ports("Port of West Sacramento", 38.5654, -121.5488)
		));
	}
}
