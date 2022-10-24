import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		String meuDia = "22/08/2022" ;
		//define datas
		LocalDate dataCadastro = tratarIFMandato(meuDia);
		LocalDate hoje = LocalDate.now();

		//calcula diferença
		long meses = dataCadastro.until(hoje, ChronoUnit.MONTHS);
		
		
		System.out.println(meses);

		
}
	
	
	
	private static LocalDate tratarIFMandato(String  diava){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dt1 = LocalDate.parse(diava.trim(), formatter);
        
        return dt1;
	}
       
	
	
}
