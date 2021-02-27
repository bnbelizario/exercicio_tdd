package fatura;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;

public class Fatura {
	 
	 private String nomeCliente;
	 private float valorTotal;
	 Date data = new Date();
	 private ArrayList<Pagamento> pagamentos = new ArrayList();
	 	 
	 public Fatura (String nomeCliente, float valorTotal) {
		 this.nomeCliente = nomeCliente;
		 this.valorTotal = valorTotal;
	 }
}