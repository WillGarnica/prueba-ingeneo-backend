package pruebaingeneo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.entidades.FormatoPelicula;
import pruebaingeneo.repositorios.FormatoPeliculaRepository;

@RestController
@RequestMapping("formatoPelicula")
@CrossOrigin
public class FormatoPeliculaController {

	@Autowired
	private FormatoPeliculaRepository iFormatoPeliculaDAO;

	@GetMapping("/")
	public List<FormatoPelicula> consultar() {
		return iFormatoPeliculaDAO.findAll();
	}

}
