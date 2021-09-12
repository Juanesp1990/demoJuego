package com.pruebaSofka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pruebaSofka.demo.vista.VentanaJuego;

@SpringBootApplication
public class JuegoApplication {

	public static void main(String[] args) {
		VentanaJuego ventana =new VentanaJuego();
                ventana.setVisible(true);
	}
        
        public static void iniciarSpring() {
        SpringApplication.run(JuegoApplication.class);
    }

}
