package pruebaingeneo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaingeneo.entidades.Sucursal;

public interface ISucursalDAO extends JpaRepository<Sucursal, Integer> {

}
