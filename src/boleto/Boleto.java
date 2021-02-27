package boleto;

import java.util.Date;

public class Boleto {
	 private int codFatura;
	 private String codigo; 
	 private double valorPago;
	 Date data;
	 
	 public Boleto(int codFatura, String codigo, double valorPago) {
		 this.codFatura = codFatura;
		 this.valorPago = valorPago;
		 this.codigo = codigo;
		 this.data = new Date();
	 }
}
