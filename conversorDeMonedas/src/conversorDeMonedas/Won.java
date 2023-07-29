package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Won extends Moneda{
	@override
	public void convertirPeso(double valorMoneda) {
		   double valorConversion= valorMoneda*0.21;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Pesos Argentinos");
	   }
	@override
	public void convertirDolar(double valorMoneda) {
		   double valorConversion= valorMoneda*0.00078;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Dolares");
	   }
	@override
	public void convertirEuro(double valorMoneda) {
		   double valorConversion= valorMoneda*0.00071;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Euros");
	   }
	@override
	 public void convertirLibra(double valorMoneda) {
		   double valorConversion= valorMoneda*0.00061;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Libras Esterlinas");
	   }
	@override
	public void convertirYen(double valorMoneda) {
		   double valorConversion= valorMoneda*0.11;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Yenes");
	   }
}
