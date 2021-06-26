package pruebaingeneo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaingeneo.entidades.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer> {

}
