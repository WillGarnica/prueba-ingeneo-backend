package pruebaingeneo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaingeneo.entidades.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

}
