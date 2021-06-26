package pruebaingeneo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the"\"SUCURSAL" database table.
 * 
 */
@Entity
@Table(name = "\"CIUDAD\"")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"IDE_CIUDAD\"")
	private Integer ideCiudad;

	@Column(name = "\"NOM_CIUDAD\"")
	private String nomCiudad;

	public Ciudad() {
	}

	public Integer getIdeCiudad() {
		return ideCiudad;
	}

	public void setIdeCiudad(Integer ideCiudad) {
		this.ideCiudad = ideCiudad;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

}