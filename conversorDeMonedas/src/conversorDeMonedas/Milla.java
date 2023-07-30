package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Milla extends Longitud{
	@override
	public void convetirMetros(double medida) {
		double valorConversion= medida*1609;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Metros");
	}
	@override
	public void convetirYardas(double medida) {
		double valorConversion= medida*1760;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Yardas");
	}
	@override
	public void convetirPies(double medida) {
		double valorConversion= medida*5280;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Pies");
	}
	@override
	public void convetirMillasNauticas(double medida) {
		double valorConversion= medida/1.151;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Millas Nauticas");
	}
}
