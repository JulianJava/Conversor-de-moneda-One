package conversorDeMonedas;

public class Peso extends Moneda{
	@override
	 public double convertirDolar(double valorMoneda) {
		   return valorMoneda*0.0037;
	   }
	@override
	public double convertirEuro(double valorMoneda) {
		   return valorMoneda*0.0033;
	   }
	@override
	public double convertirLibra(double valorMoneda) {
		   return valorMoneda*0.0029;
	   }
	@override
	public double convertirYen(double valorMoneda) {
		   return valorMoneda*0.52;
	   }
	@override
	 public double convertirWon(double valorMoneda) {
		   return valorMoneda*4.70;
	   }
}
