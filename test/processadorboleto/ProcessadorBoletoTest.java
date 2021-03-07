package processadorboleto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

public class ProcessadorBoletoTest {
	private Fatura fatura;
	private ArrayList<Boleto> boletos = new ArrayList();
	private ProcessadorBoleto processadorBoleto;
	
	@BeforeEach
	public void inicializaFatura() {
		fatura = new Fatura("Belizario", 50000.00, 1, new Date());
		Boleto boleto1 = new Boleto(1, "1234", 10000.0);
		
		boletos.add(boleto1);
		
		ProcessadorBoleto processaBoleto = new ProcessadorBoleto();
	}
	
	@Test
	@DisplayName("Testa o pagamento da fatura em caso de boletos insuficientes para considerar paga")
	public void testFaturaPagaError() {
		processadorBoleto.pagar(boletos, fatura);
		
		assertFalse(fatura.pagou());
	}

	@Test
	@DisplayName("Testa o pagamento da fatura em caso de boletos suficientes para considerar paga")
	public void testFaturaPagaSucesso() {
		Boleto boleto2 = new Boleto(1, "4567", 20000.0);
		Boleto boleto3 = new Boleto(1, "8902", 20000.0);
		
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		processadorBoleto.pagar(boletos, fatura);
		
		assertTrue(fatura.pagou());
	}
}