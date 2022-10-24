import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class FiltroFaturaTeste  {
	
	 Cliente pessoa1;
	 Fatura fatura1;
	 Cliente pessoa2;
	 Fatura fatura2;
	 Cliente pessoa3;
	 Fatura fatura3;
	 Cliente pessoa4;
	 Fatura fatura4;
	 Cliente pessoa5;
	 Fatura fatura5;
	 Cliente pessoa6;
	 Fatura fatura6;
	 Cliente pessoa7;
	 Fatura fatura7;
	 Cliente pessoa8;
	 Fatura fatura8;
	 Cliente pessoa9;
	 Fatura fatura9;
	 Cliente pessoa10;
	 Fatura fatura10;
	 Cliente pessoa11;
	 Fatura fatura11;
	 Cliente pessoa12;
	 Fatura fatura12;
	 Cliente pessoa13;
	 Fatura fatura13;
	 Cliente pessoa14;
	 Fatura fatura14;
	 FiltroFatura  todasFaturas = new FiltroFatura();
	 
	
	
	@Before
	public void setup() {
		
		pessoa1 = new Cliente("Joao", "14/11/2019", "Sao Paulo");
		fatura1 = new Fatura("5858", 4000,"22/08/2022", pessoa1);
		pessoa2 = new Cliente("Maria", "14/11/2019", "Santa Catarina");
		fatura2 = new Fatura("5858", 1800,"22/08/2022", pessoa2);
		pessoa3 = new Cliente("Alberto", "23/08/2022", "Paraiba");
		fatura3 = new Fatura("5858", 2400,"24/09/2022", pessoa3);
		pessoa4 = new Cliente("Pedro","23/08/2022", "Fortaleza");
		fatura4 = new Fatura("5858", 2300,"05/08/2022", pessoa4);
		pessoa5 = new Cliente("Sonia", "23/08/2022", "Rio de Janeiro");
		fatura5 = new Fatura("5858",3500,"24/09/2022", pessoa5); 
		pessoa6 = new Cliente("Maicon", "24/08/2022", "Rio de Janeiro");
		fatura6 = new Fatura("5858",2800,"24/07/2022", pessoa6); 
		pessoa7 = new Cliente("Marcos", "15/07/2022", "Rio de Janeiro");
		fatura7 = new Fatura("5858",2950,"24/10/2022", pessoa7);
		pessoa8 = new Cliente("Tadeu", "15/10/2022", "Rio de Janeiro");
		fatura8 = new Fatura("5858",3400,"24/10/2022", pessoa8);
		pessoa9 = new Cliente("Lucas", "15/10/2022", "Rio Grande do Sul");
		fatura9 = new Fatura("5858",4200,"24/10/2022", pessoa9);
		pessoa10 = new Cliente("Ana", "14/10/2022", "Santa Catarina");
		fatura10 = new Fatura("5858",6200,"24/10/2022", pessoa10);
		pessoa11 = new Cliente("Jose", "15/10/2022", "Parana");
		fatura11 = new Fatura("5858",5000,"24/10/2022", pessoa11);
		pessoa12 = new Cliente("Sofia", "15/10/2022", "Parana");
		fatura12 = new Fatura("5858",3200,"24/10/2022", pessoa12);
		pessoa13 = new Cliente("Debora", "15/10/2022", "Rio Grande Do Sul");
		fatura13 = new Fatura("5858",3600,"24/10/2022", pessoa13);
		pessoa14 = new Cliente("Victor", "15/10/2022", "Santa Catarina");
		fatura14 = new Fatura("5858",3900,"24/10/2022", pessoa14);

	}
	
	@Test
	public void filtrarFaturaSemRemover() {
		
		todasFaturas.listaDeFaturas.add(fatura1);
		ArrayList<Fatura> esperado = todasFaturas.listaDeFaturas;
		todasFaturas.verificaFatura();
		ArrayList<Fatura> atual = todasFaturas.listaDeFaturas;
		assertEquals(esperado, atual);
	}
	
	@Test
	public void faturaMenorQue2000() {
		
		todasFaturas.listaDeFaturas.add(fatura2);
		int esperado = 0;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
		
	}
	
	
	@Test
	public void valorEntre2000E25001MesAtras() {
		todasFaturas.listaDeFaturas.add(fatura3);
		int esperado = 0;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	@Test
	public void valorEntre2000E2500SemUmMesAtras() {
		todasFaturas.listaDeFaturas.add(fatura4); 
		
		
		int esperado = 1;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		System.out.println(atual);
		assertEquals(esperado, atual);
	}
	
	@Test
	public void umMesAtrasSemValorEntre20000E2500 () {
		todasFaturas.listaDeFaturas.add(fatura5); 
		int esperado = 1;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	
	@Test
	public void valorEntre2500E3000DoisMesesAtrasCliente() {
		todasFaturas.listaDeFaturas.add(fatura6);
		int esperado = 0;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	
	@Test
	public void valorEntre2500E3000SemDoisMesesAtrasCliente() {
		todasFaturas.listaDeFaturas.add(fatura7);
		int esperado = 1;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	
	@Test
	public void doisMesesAtrasSemValorEntre25000E3000() {
		todasFaturas.listaDeFaturas.add(fatura8);
		int esperado = 1;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	
	@Test
	public void valormaiorque4000RegiaoSul() {
		
		todasFaturas.listaDeFaturas.add(fatura10);
		todasFaturas.listaDeFaturas.add(fatura11);
		
		int esperado = 0;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
		
	}
	@Test
	public void valorMenorque4000RegiaoSul() {
		todasFaturas.listaDeFaturas.add(fatura12);
		todasFaturas.listaDeFaturas.add(fatura13);
		todasFaturas.listaDeFaturas.add(fatura14);
		
		int esperado = 3;
		todasFaturas.verificaFatura();
		int atual = todasFaturas.listaDeFaturas.size();
		assertEquals(esperado, atual);
	}
	
	
	
}