import java.time.LocalDate;
import java.util.Calendar;

public class Fatura {
	
	private String codigo;
	private Integer valor;
	private String data;
	Cliente cliente;


	
	public Fatura( String codig, Integer valo, String dat, Cliente client ) {
		this.codigo =codig;
		this.valor = valo;
		this.data = dat;
		this.cliente = client;
	}
	public Fatura() {
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	
	
	
}
