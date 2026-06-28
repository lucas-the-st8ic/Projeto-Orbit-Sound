package com.orbitsound;

import com.orbitsound.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrbitsoundApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrbitsoundApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();
        main.showMenu();
    }
}
