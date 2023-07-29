package conversorDeMonedas;

import javax.swing.JOptionPane;

public class LibraEsterlina extends Moneda {
	@override
	 public void convertirPeso(double valorMoneda) {
		   double valorConversion= valorMoneda*350.35;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Pesos Argentinos");
	   }
	@override
	public void convertirDolar(double valorMoneda) {
		   double valorConversion= valorMoneda*1.29;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Dolares");
	   }
	@override
	  public void convertirEuro(double valorMoneda) {
		   double valorConversion= valorMoneda*1.17;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Euros");
	   }
	@override
	public void convertirYen(double valorMoneda) {
		   double valorConversion= valorMoneda*181.84;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Yenes");
	   }
	@override
	public void convertirWon(double valorMoneda) {
		   double valorConversion= valorMoneda*1646.48;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Wones");
	   }

}
