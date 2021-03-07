package processadorboleto;

import boleto.*;
import fatura.*;
import java.util.ArrayList;

public class ProcessadorBoleto {
	
	public static void pagar(ArrayList<Boleto> boletos , Fatura fatura) {
		double valor_total = 0.0;
		for(int i = 0; i < boletos.size(); i++) {
			valor_total = valor_total + boletos.get(i).getValorPago();
		}
		
		if(valor_total >= fatura.getValorTotal()) {
			fatura.pagar();
		}

	}
}
