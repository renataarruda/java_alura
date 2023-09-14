package br.com.alura.screenserie;

import br.com.alura.screenserie.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenserieApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenserieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
