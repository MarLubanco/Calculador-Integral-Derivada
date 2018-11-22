package br.com.calculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculoApplication.class, args);
		System.out.println("------------------------------");
		System.out.println("Integral Definida");
		System.out.println("------------------------------");
	}
}
