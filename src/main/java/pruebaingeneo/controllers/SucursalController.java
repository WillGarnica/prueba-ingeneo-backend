package pruebaingeneo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.entidades.Sucursal;
import pruebaingeneo.repositorios.SucursalRepository;

@RestController
@RequestMapping("sucursal")
@CrossOrigin
public class SucursalController {

	@Autowired
	private SucursalRepository Sucursal;

	@GetMapping("/")
	public List<Sucursal> consultar() {
		return Sucursal.findAll();
	}

}
