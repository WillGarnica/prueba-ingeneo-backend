package pruebaingeneo.cliente;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import pruebaingeneo.entidades.Cliente;
import pruebaingeneo.servicios.ClienteService;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClienteServiceTest {

	@Autowired
	ClienteService clienteService;

	@Test
	private void testConsultar() throws Exception {
		List<Cliente> lstClientes = clienteService.consultar(null);
		boolean existeAlMenosUnCliente = lstClientes != null && !lstClientes.isEmpty();

		assertTrue(existeAlMenosUnCliente);

	}
}
