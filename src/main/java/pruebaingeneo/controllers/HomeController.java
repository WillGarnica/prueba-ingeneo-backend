package pruebaingeneo.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "{\"msj\":\"Servidor BackEnd para prueba de Ingeneo. Servidor arriba. Hora servidor: " + new Date() + "\"}";
	}

}
