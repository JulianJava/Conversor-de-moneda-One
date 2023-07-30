package conversorDeMonedas;

import javax.swing.JOptionPane;

public class Pie extends Longitud{
	@override
	public void convetirMetros(double medida) {
		double valorConversion= medida/3.281;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Metros");
	}
	@override
	public void convetirMillas(double medida) {
		double valorConversion= medida/5280;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Millas");
	}
	@override
	public void convetirYardas(double medida) {
		double valorConversion= medida/3;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Yarda");
	}
	@override
	public void convetirMillasNauticas(double medida) {
		double valorConversion=medida/6076;
		JOptionPane.showMessageDialog(null, "Serian " +valorConversion+ " Millas Nauticas");
	}
}
