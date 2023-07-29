package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Euro extends Moneda {
	@override
	 public void convertirPeso(double valorMoneda) {
		   double valorConversion= valorMoneda*300.26;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Pesos Argentinos");
	   }
	@override
	 public void convertirDolar(double valorMoneda) {
		   double valorConversion= valorMoneda*1.11;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Dolares");
	   }
	@override
	 public void convertirLibra(double valorMoneda) {
		   double valorConversion= valorMoneda*0.86;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Libras Esterlinas");
	   }
	@override
	public void convertirYen(double valorMoneda) {
		   double valorConversion= valorMoneda*155.79;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Yenes");
	   }
	@override
	public void convertirWon(double valorMoneda) {
		   double valorConversion= valorMoneda*1411.23;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Wones");
	   }
}
