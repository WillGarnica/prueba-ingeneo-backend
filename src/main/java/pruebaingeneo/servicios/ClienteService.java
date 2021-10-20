package pruebaingeneo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaingeneo.entidades.Cliente;
import pruebaingeneo.repositorios.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> consultar(Cliente clienteFiltro) throws Exception {
		return clienteRepository.findAll();
	}

	public Cliente consultarPorID(long id) throws Exception {
		Optional<Cliente> optionalCliente = clienteRepository.findById(id);
		return optionalCliente.isEmpty() ? null : optionalCliente.get();
	}

	public Cliente crear(Cliente cliente) throws Exception {
		return clienteRepository.save(cliente);
	}

	public Cliente editar(Cliente cliente) throws Exception {
		return clienteRepository.save(cliente);
	}

	public void eliminar(long id) throws Exception {
		clienteRepository.deleteById(id);
	}
}
