package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudante")
public class Estudante{
	@Id
	@GeneratedValue
	@Column(name = "ESTUDANTE_ID")
	private long EstudanteId;
	
	
	@Column(name = "estudante_NOME", nullable = false, length = 100)
	private String estudanteNome;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Endereco estudanteEndereco;

	public Estudante() {
	}

	public Estudante(String estudanteNome, Endereco estudanteEndereco) {
		this.estudanteNome = estudanteNome;
		this.estudanteEndereco = estudanteEndereco;
	}

	
	public long getEstudante() {
		return this.estudanteId;
	}

	public void setEstudanteId(long estudantetId) {
		this.estudanteId =estudante;
	}

	
	public String getStudentNome() {
		return this.estudanteNome;
	}

	public void setEstudanteNome(String estudanteNome) {
		this.estudanteNome = estudanteNome;
	}

	
	public Endereco getEstudanteEndereco() {
		return this.estudanteEndereco;
	}

	public void setEstudanteEndereco(Endereco estudanteEndereco) {
		this.estudanteEndereco = estudanteEndereco;
	}
}