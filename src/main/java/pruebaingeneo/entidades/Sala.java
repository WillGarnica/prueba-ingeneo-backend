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
@Table(name = "\"SALA\"")
public class Sala implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "\"IDE_SALA\"")
	private Integer ideSala;

	@Column(name = "\"NUM_FILAS\"")
	private Integer numFilas;

	@Column(name = "\"NUM_MAX_SILLAS_POR_FILA\"")
	private Integer numMaxSillasPorFila;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "\"IDE_FORMATO_PELICULA\"") })
	private FormatoPelicula formatoPelicula;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "\"IDE_SUCURSAL\"") })
	private Sucursal sucursal;

	public Sala() {
	}

	public Integer getIdeSala() {
		return this.ideSala;
	}

	public void setIdeSala(Integer ideSala) {
		this.ideSala = ideSala;
	}

	public Integer getNumFilas() {
		return this.numFilas;
	}

	public void setNumFilas(Integer numFilas) {
		this.numFilas = numFilas;
	}

	public Integer getNumMaxSillasPorFila() {
		return this.numMaxSillasPorFila;
	}

	public void setNumMaxSillasPorFila(Integer numMaxSillasPorFila) {
		this.numMaxSillasPorFila = numMaxSillasPorFila;
	}

	public FormatoPelicula getFormatoPelicula() {
		return this.formatoPelicula;
	}

	public void setFormatoPelicula(FormatoPelicula formatoPelicula) {
		this.formatoPelicula = formatoPelicula;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}