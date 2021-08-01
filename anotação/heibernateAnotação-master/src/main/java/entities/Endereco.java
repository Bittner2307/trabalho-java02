package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	@Id
	@GeneratedValue
	@Column(name = "ENDERECO_ID")
	private long enderecoId;
	
	@Column(name = "ENDERECO_RUA", nullable = false, length = 250)
	private String rua;
	
	@Column(name = "ENDERECO_CIDADE", nullable = false, length = 50)
	private String cidade;
	
	@Column(name = "ENDERECO_ESTADO", nullable = false, length = 50)
	private String estado;
	
	@Column(name = "ENDERECO_CEP", nullable = false, length = 10)
	private String cep;

	public Endereco() {
	}

	public Endereco (String rua, String cidade, String estado, String cep) {
		this.street = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	
	public long getEnderecoId() {
		return this.enderecoId;
	}

	public void setEnderecoId(long addressId) {
		this.enderecoId = enderecoId;
	}

	
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
