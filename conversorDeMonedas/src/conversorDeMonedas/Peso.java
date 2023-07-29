package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Peso extends Moneda{
	@override
	 public void convertirDolar(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0037;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Dolares");
	   }
	@override
	public void convertirEuro(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0033;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Euros");

	   }
	@override
	public void convertirLibra(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0029;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Libras Esterlinas");

	   }
	@override
	public void convertirYen(double valorMoneda) {
		   double valorConversion= valorMoneda*0.52;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Yenes");

	   }
	@override
	 public void convertirWon(double valorMoneda) {
		   double valorConversion= valorMoneda*4.70;
	      JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Wones");

	   }
}
