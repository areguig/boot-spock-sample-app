package io.areguig.bootspock;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;

@SpringBootApplication
public class BootSpockSampleAppApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.bannerMode(Banner.Mode.OFF)
				.sources(BootSpockSampleAppApplication.class)
				.listeners(new ApplicationPidFileWriter())
				.run(args);
	}
}
