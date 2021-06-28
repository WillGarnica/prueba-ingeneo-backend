package pruebaingeneo.restservices;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin
public class HomeREST {

	@Autowired

	@GetMapping("/")
	public String home() {
		return "{\"msj\":\"Servidor BackEnd para prueba de Ingeneo. Servidor arriba. Hora servidor: " + new Date() + "\"}";
	}

}
