package fatura;

import java.util.ArrayList;
import java.util.Date;

import boleto.Boleto;

public class Fatura {
	 
	 private String nomeCliente;
	 private double valorTotal;
	 private int codFatura;
	 Date data = new Date();
	 private ArrayList<Pagamento> pagamentos = new ArrayList();
	 	 
	 public Fatura (String nomeCliente, double valorTotal, int codFatura, Date data) {
		 this.nomeCliente = nomeCliente;
		 this.valorTotal = valorTotal;
		 this.data = data;
	 }
}