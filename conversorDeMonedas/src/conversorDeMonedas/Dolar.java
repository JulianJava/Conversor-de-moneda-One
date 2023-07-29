package conversorDeMonedas;
import javax.swing.JOptionPane;

public class Dolar extends Moneda{
	   @override
       public void convertirPeso(double valorMoneda) {
    	  double valorConversion= valorMoneda*271.62;
          JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Pesos Argentinos");
       }
	   @override
	   public void convertirEuro(double valorMoneda) {
		   double valorConversion= valorMoneda*0.90;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Euros");
	   }
	   @override
	   public void convertirLibra(double valorMoneda) {
		   double valorConversion= valorMoneda*0.78;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Libras Esterlinas");

	   }
	   @override
	   public void convertirYen(double valorMoneda) {
		   double valorConversion= valorMoneda*140.96;
	       JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " Yenes");

	   }
	   @override
	   public void convertirWon(double valorMoneda) {
		  double valorConversion= valorMoneda*1276.58;
	      JOptionPane.showMessageDialog(null, "Tienes $ " +valorConversion+ " WONES");

	   }
}
