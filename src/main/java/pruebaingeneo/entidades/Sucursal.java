package pruebaingeneo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "\"SUCURSAL\"")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"ID_SUCURSAL\"")
	private Integer idSucursal;

	@Column(name = "\"DIRECCION\"")
	private String direccion;

	@Column(name = "\"ID_ADMINISTRADOR\"")
	private Integer idAdministrador;

	@Column(name = "\"NOMBRE\"")
	private String nombre;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "\"IDE_CIUDAD\"") })
	private Ciudad ciudad;

	public Sucursal() {
	}

	public Integer getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIdAdministrador() {
		return this.idAdministrador;
	}

	public void setIdAdministrador(Integer idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}