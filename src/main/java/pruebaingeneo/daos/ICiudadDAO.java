package pruebaingeneo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaingeneo.entidades.Ciudad;

public interface ICiudadDAO extends JpaRepository<Ciudad, Integer> {

}
