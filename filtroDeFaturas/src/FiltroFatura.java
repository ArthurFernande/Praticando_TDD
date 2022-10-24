import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;


import java.util.List;


public class FiltroFatura {
	ArrayList<Fatura> listaDeFaturas = new ArrayList();
	Fatura fatura;
	
	
	public void verificaFatura() {
		
		boolean remover = false;
		int count =0;
		
		while(count < listaDeFaturas.size()) {
			
			fatura =listaDeFaturas.get(count);
			if(fatura.getValor() < 2000) {
				remover=true;
				
			}else if (fatura.getValor() > 2000 && fatura.getValor() < 2500 && verificaData1(fatura.getData())){
				remover =true;
			}else if(fatura.getValor() > 2500 && fatura.getValor() < 3000 && verificaData2(fatura.getCliente().getDataInclusao()) ) {
				remover =true;
			}else if((fatura.getValor() > 4000)&& fatura.getCliente().getEstado().equals("Santa Catarina")){
				remover =true;
			}else if((fatura.getValor() > 4000)&& fatura.getCliente().getEstado().equals("Rio Grande do Sul")){
				remover =true;
			}else if((fatura.getValor() > 4000)&& fatura.getCliente().getEstado().equals("Parana")){
				remover =true;
			}
			if(remover) {
				listaDeFaturas.remove(this.fatura);
				count = 0;
			}else {
				count++;
			}
		}
		
		
	}
	
	
	
	public static boolean verificaData1 (String dia1) {
		
		// transforma data string em localDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dia1EmDate = LocalDate.parse(dia1.trim(), formatter);

		//define datas
		LocalDate dataCadastro = dia1EmDate;
		LocalDate hoje = LocalDate.now();

		//calcula diferença
		long meses = dataCadastro.until(hoje, ChronoUnit.MONTHS);
		
		//verifica
		if(meses <= 1) {
			return true;
		}
			return false;	
		
	}
	
	public static boolean verificaData2 (String dia2) {
		
		// transforma data string em localDate
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dia2EmDate = LocalDate.parse(dia2.trim(), formatter);
        
		//define datas
		LocalDate dataCadastro = dia2EmDate;
		LocalDate hoje = LocalDate.now();

		//calcula diferença
		long meses = dataCadastro.until(hoje, ChronoUnit.MONTHS);
		
		//verifica
		if(meses <= 2) {
			return true;
		}
		return false;	
		
	}
	
	public List<Fatura> getListaDeFaturas() {
		return listaDeFaturas;
	}


	public void setListaDeFaturas(ArrayList<Fatura> listaDeFaturas) {
		this.listaDeFaturas = listaDeFaturas;
	}


	public Fatura getFatura() {
		return fatura;
	}


	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
}
