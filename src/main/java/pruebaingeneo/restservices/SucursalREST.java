package pruebaingeneo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.daos.ISucursalDAO;
import pruebaingeneo.entidades.Sucursal;

@RestController
@RequestMapping("sucursal")
@CrossOrigin
public class SucursalREST {

	@Autowired
	private ISucursalDAO Sucursal;

	@GetMapping("/")
	public List<Sucursal> consultar() {
		return Sucursal.findAll();
	}

}
