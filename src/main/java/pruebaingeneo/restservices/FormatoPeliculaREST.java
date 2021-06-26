package pruebaingeneo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.daos.IFormatoPeliculaDAO;
import pruebaingeneo.entidades.FormatoPelicula;

@RestController
@RequestMapping("formatoPelicula")
@CrossOrigin
public class FormatoPeliculaREST {

	@Autowired
	private IFormatoPeliculaDAO iFormatoPeliculaDAO;

	@GetMapping("/")
	public List<FormatoPelicula> consultar() {
		return iFormatoPeliculaDAO.findAll();
	}

}
