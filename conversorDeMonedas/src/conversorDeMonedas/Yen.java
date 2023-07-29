package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Yen extends Moneda{
	@override
	public void convertirPeso(double valorMoneda) {
		   double valorConversion= valorMoneda*1.93;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Pesos Argentinos");
	   }
	@override
	 public void convertirDolar(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0071;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Dolares");
	   }
	@override
	 public void convertirEuro(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0064;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Euros");
	   }
	@override
	 public void convertirLibra(double valorMoneda) {
		   double valorConversion= valorMoneda*0.0055;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Libras Esterlinas");
	   }
	@override
	 public void convertirWon(double valorMoneda) {
		   double valorConversion= valorMoneda*9.05;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Wones");
	   }
}
