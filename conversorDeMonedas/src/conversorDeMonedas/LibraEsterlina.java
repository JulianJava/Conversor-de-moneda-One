package conversorDeMonedas;

public class LibraEsterlina extends Moneda {
	@override
	 public double convertirPeso(double valorMoneda) {
		   return valorMoneda*350.35;
	   }
	@override
	public double convertirDolar(double valorMoneda) {
		   return valorMoneda*1.29;
	   }
	@override
	  public double convertirEuro(double valorMoneda) {
		   return valorMoneda*1.17;
	   }
	@override
	public double convertirYen(double valorMoneda) {
		   return valorMoneda*181.84;
	   }
	@override
	public double convertirWon(double valorMoneda) {
		   return valorMoneda*1646.48;
	   }

}
