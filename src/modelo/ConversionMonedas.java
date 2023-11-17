package modelo;

public class ConversionMonedas {
	
	private String monedaOrigen;
	private String monedaDestino;
	private double monto;
	private double resultado = 0.00;
	
	public ConversionMonedas(String monedaOrigen, String monedaDestino, double monto) {
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.monto = monto;
	}
	
	public double ConvertirMonedas(String tipoConversion, String tipoCambio, double cantidad) {
		
		//Cambio de dolar estadounidense a los demás
		if(this.monedaOrigen.equals("Dólar estadounidense") && this.monedaDestino.equals("Dólar estadounidense")) {
			return resultado = this.monto;
		}
		
		if(this.monedaOrigen.equals("Dólar estadounidense") && this.monedaDestino.equals("Peso argentino")) {
			return resultado = this.monto * 350.04;
		}
		
		if(this.monedaOrigen.equals("Dólar estadounidense") && this.monedaDestino.equals("Sol peruano")) {
			return resultado = this.monto * 3.84;
		}
		
		if(this.monedaOrigen.equals("Dólar estadounidense") && this.monedaDestino.equals("Euro")) {
			return resultado = this.monto * 0.95;
		}
		
		//Cambio de peso argentino a los demás
		if(this.monedaOrigen.equals("Peso argentino") && this.monedaDestino.equals("Dólar estadounidense")) {
			return resultado = this.monto * 0.0029;
		}
		
		if(this.monedaOrigen.equals("Peso argentino") && this.monedaDestino.equals("Peso argentino")) {
			return resultado = this.monto;
		}
		
		if(this.monedaOrigen.equals("Peso argentino") && this.monedaDestino.equals("Sol peruano")) {
			return resultado = this.monto * 0.011;
		}
		
		if(this.monedaOrigen.equals("Peso argentino") && this.monedaDestino.equals("Euro") ) {
			return resultado = this.monto * 0.0027;
		}
		
		//Cambio de Sol peruano a los demás
		if(this.monedaOrigen.equals("Sol peruano") && this.monedaDestino.equals("Dólar estadounidense")) {
			return resultado = this.monto * 0.26;
		}
				
		if(this.monedaOrigen.equals("Sol peruano") && this.monedaDestino.equals("Peso argentino")) {
			return resultado = this.monto * 91.11;
		}
				
		if(this.monedaOrigen.equals("Sol peruano") && this.monedaDestino.equals("Sol peruano")) {
			return resultado = this.monto;
		}
				
		if(this.monedaOrigen.equals("Sol peruano") && this.monedaDestino.equals("Euro") ) {
			return resultado = this.monto * 0.25;
		}
		
		//Cambio de Euro a los demás
		if(this.monedaOrigen.equals("Euro") && this.monedaDestino.equals("Dólar estadounidense")) {
			return resultado = this.monto * 1.05;
		}
						
		if(this.monedaOrigen.equals("Euro") && this.monedaDestino.equals("Peso argentino")) {
			return resultado = this.monto * 368.22;
		}
						
		if(this.monedaOrigen.equals("Euro") && this.monedaDestino.equals("Sol peruano")) {
			return resultado = this.monto * 4.04;
		}
						
		if(this.monedaOrigen.equals("Euro") && this.monedaDestino.equals("Euro") ) {
			return resultado = this.monto;
		}
		
		return resultado = 0.00;
	}
}
