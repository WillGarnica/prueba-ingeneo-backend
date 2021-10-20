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

import pruebaingeneo.entidades.Cliente;
import pruebaingeneo.servicios.ClienteService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("")
	public List<Cliente> consultar() throws Exception {
		return clienteService.consultar(null);
	}

	@GetMapping("/{id}")
	public Cliente consultarPorID(@PathVariable("id") long id) throws Exception {
		return clienteService.consultarPorID(id);
	}

	@PostMapping("")
	public Cliente crear(@RequestBody Cliente cliente) throws Exception {
		return clienteService.crear(cliente);
	}

	@PutMapping("")
	public Cliente editar(@RequestBody Cliente cliente) throws Exception {
		return clienteService.editar(cliente);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") long id) throws Exception {
		clienteService.eliminar(id);
	}

}
