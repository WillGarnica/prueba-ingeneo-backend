package pruebaingeneo.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;

import pruebaingeneo.daos.ISalaDAO;
import pruebaingeneo.entidades.Sala;

@RestController
@RequestMapping("sala")
@CrossOrigin
public class SalaREST {

	@Autowired
	private ISalaDAO iSalaDAO;

	@GetMapping("/")
	public List<Sala> consultar() {
		return iSalaDAO.findAll();
	}

	@PostMapping("/")
	public Sala crear(@RequestBody Sala salaACrear) {
		System.out.println("llega "+new Gson().toJson(salaACrear));
		return iSalaDAO.save(salaACrear);
	}

	@PutMapping("/")
	public Sala editar(@RequestBody Sala salaACrear) {
		System.out.println("llega "+new Gson().toJson(salaACrear));
		/* para editar utilice tambien el save ya que este opera como un merge */
		return iSalaDAO.save(salaACrear);
	}

	@DeleteMapping("/")
	public void remover(@RequestBody Sala salaACrear) {
		iSalaDAO.delete(salaACrear);
	}

}
