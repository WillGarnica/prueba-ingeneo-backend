package pruebaingeneo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaingeneo.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
