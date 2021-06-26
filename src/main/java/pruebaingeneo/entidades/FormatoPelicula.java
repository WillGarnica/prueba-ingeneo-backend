package pruebaingeneo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "\"FORMATO_PELICULA\"")
public class FormatoPelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"IDE_FORMATO_PELICULA\"")
	private Integer ideFormatoPelicula;

	@Column(name = "\"NOM_FORMATO_PELICULA\"")
	private String nomFormatoPelicula;

	public FormatoPelicula() {
	}

	public Integer getIdeFormatoPelicula() {
		return this.ideFormatoPelicula;
	}

	public void setIdeFormatoPelicula(Integer ideFormatoPelicula) {
		this.ideFormatoPelicula = ideFormatoPelicula;
	}

	public String getNomFormatoPelicula() {
		return this.nomFormatoPelicula;
	}

	public void setNomFormatoPelicula(String nomFormatoPelicula) {
		this.nomFormatoPelicula = nomFormatoPelicula;
	}

}