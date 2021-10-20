package pruebaingeneo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.entidades.Ciudad;
import pruebaingeneo.repositorios.CiudadRepository;

@RestController
@RequestMapping("ciudad")
@CrossOrigin
public class CiudadController {

	@Autowired
	private CiudadRepository iCiudadDAO;

	@GetMapping("/")
	public List<Ciudad> consultar() {
		return iCiudadDAO.findAll();
	}

}
