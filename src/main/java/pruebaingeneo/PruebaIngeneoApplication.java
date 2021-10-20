package pruebaingeneo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pruebaingeneo.entidades.Cliente;
import pruebaingeneo.repositorios.ClienteRepository;

@SpringBootApplication
public class PruebaIngeneoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaIngeneoApplication.class, args);
	}

//	@Bean
	CommandLineRunner commandLineRunner(ClienteRepository clienteRepository) {
		return args -> {

			// si no esxiste lclientes se crea uno
			List<Cliente> lstClientes = clienteRepository.findAll();
			if (lstClientes == null || lstClientes.isEmpty()) {
				Cliente cliente1 = new Cliente();
				cliente1.setNombres("Nombres prueba1");
				cliente1.setApellidos("Apellidos cliente1");
				cliente1.setNumDocumento((long) 123456);
				clienteRepository.save(cliente1);
			}

		};
	}
}
