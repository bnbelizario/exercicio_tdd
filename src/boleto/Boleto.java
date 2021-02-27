package boleto;

import java.util.Date;

public class Boleto {
	 private int codFatura;
	 private int codigo; 
	 private float valorPago;
	 Date data;
	 
	 public Boleto(int codFatura, int codigo, float valorPago) {
		 this.codFatura = codFatura;
		 this.valorPago = valorPago;
		 this.codigo = codigo;
	 }
}
