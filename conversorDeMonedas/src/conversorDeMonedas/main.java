package conversorDeMonedas;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
	 Conversor monedas = new Conversor();
	 ConversorLongitudes longitud=new ConversorLongitudes();
	
		 String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Longitudes"}, "Seleccion")).toString();
	     switch(opciones) {
	     case "Conversor de Moneda":
		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
	      if(input==null) {
		                    JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");
	                                                                        }
	 if(ValidarNumero(input)==true) {
	 double Minput = Double.parseDouble(input);
	 monedas.ConvertirMonedas(Minput);
	 int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
     while (JOptionPane.OK_OPTION == respuesta){
    	 String input2 = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
    	 if(input2==null) {
    		 JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");
    	 }
    	 if(ValidarNumero(input2)==true) {
    	 double Minput2 = Double.parseDouble(input2);
    	 monedas.ConvertirMonedas(Minput2);}
    	 else {JOptionPane.showMessageDialog(null, "Caracter inválido");}
     }
     if(JOptionPane.NO_OPTION == respuesta||JOptionPane.CANCEL_OPTION == respuesta||JOptionPane.CLOSED_OPTION == respuesta){
        	JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");                         
     }}else{
    	 JOptionPane.showMessageDialog(null, "Caracter inválido");
     }
	 break;
	     case "Conversor de Longitudes":
	    	 String inputLongitud = JOptionPane.showInputDialog("Ingresa la Medida que deseas convertir: ");
		      if(inputLongitud==null) {
			                    JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");
		                                                                        }
		 if(ValidarNumero(inputLongitud)==true) {
		 double Minput = Double.parseDouble(inputLongitud);
		 longitud.ConvertirLongitudes(Minput);
		 int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	     while (JOptionPane.OK_OPTION == respuesta){
	    	 String input2 = JOptionPane.showInputDialog("Ingresa la Medida que deseas convertir: ");
	    	 if(input2==null) {
	    		 JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");
	    	 }
	    	 if(ValidarNumero(input2)==true) {
	    	 double Minput2 = Double.parseDouble(input2);
	    	 monedas.ConvertirMonedas(Minput2);}
	    	 else {JOptionPane.showMessageDialog(null, "Caracter inválido");}
	     }
	     if(JOptionPane.NO_OPTION == respuesta||JOptionPane.CANCEL_OPTION == respuesta||JOptionPane.CLOSED_OPTION == respuesta){
	        	JOptionPane.showMessageDialog(null, "Gracias por usar mi conversor");                         
	     }}else{
	    	 JOptionPane.showMessageDialog(null, "Caracter inválido");
	     }
	   break; 
	 }
	}
	
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
