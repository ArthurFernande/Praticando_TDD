import java.time.LocalDate;

public class Cliente {
	
	private String nomeCliente;
	private String dataInclusao;
	private String Estado;
	
	public Cliente(String nomeClient, String dataInclus, String Estad) {
		this.nomeCliente = nomeClient;
		this.dataInclusao = dataInclus;
		this.Estado =Estad;
	}
	public Cliente () {
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	

	public String getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
}
