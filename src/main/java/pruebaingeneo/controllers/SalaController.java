package pruebaingeneo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pruebaingeneo.entidades.Sala;
import pruebaingeneo.repositorios.SalaRepository;

@RestController
@RequestMapping("sala")
@CrossOrigin
public class SalaController {

	@Autowired
	private SalaRepository iSalaDAO;

	@GetMapping("/")
	public List<Sala> consultar() {
		return iSalaDAO.findAll();
	}

	@PostMapping("/")
	public Sala crear(@RequestBody Sala sala) {
		return iSalaDAO.save(sala);
	}

	@PutMapping("/")
	public Sala editar(@RequestBody Sala sala) {
		/* para editar utilice tambien el save ya que este opera como un merge */
		return iSalaDAO.save(sala);
	}

	@DeleteMapping("/{ideSala}")
	public void remover(@PathVariable("ideSala") int ideSala ) {
		iSalaDAO.deleteById(ideSala);
	}

}
