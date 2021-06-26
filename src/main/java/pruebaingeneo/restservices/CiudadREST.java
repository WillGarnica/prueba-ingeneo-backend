package pruebaingeneo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.daos.ICiudadDAO;
import pruebaingeneo.entidades.Ciudad;

@RestController
@RequestMapping("ciudad")
@CrossOrigin
public class CiudadREST {

	@Autowired
	private ICiudadDAO iCiudadDAO;

	@GetMapping("/")
	public List<Ciudad> consultar() {
		return iCiudadDAO.findAll();
	}

}
