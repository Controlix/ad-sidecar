package net.persgroep.ad.node;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
