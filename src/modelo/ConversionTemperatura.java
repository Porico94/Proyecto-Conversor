package modelo;

public class ConversionTemperatura {
	
	private String tipoConversion;
	private String tipoCambio;
	private double cantidad;
	private double resultado = 0.00;
	
	public ConversionTemperatura(String tipoConversion, String tipoCambio, double cantidad) {
		this.tipoConversion = tipoConversion;
		this.tipoCambio = tipoCambio;
		this.cantidad = cantidad;
	}
	
	public double ConvertirTemperaturas(String tipoConversion, String tipoCambio, double cantidad) {
		
		//Cambio de Celsius a los demás
		if(this.tipoConversion.equals("Celsius") && this.tipoCambio.equals("Celsius")) {
			return resultado = this.cantidad;
		}
		
		if(this.tipoConversion.equals("Celsius") && this.tipoCambio.equals("Fahrenheit")) {
			return resultado = (this.cantidad * 9/5) + 32;
		}
		
		if(this.tipoConversion.equals("Celsius") && this.tipoCambio.equals("Kelvin")) {
			return resultado = this.cantidad + 273.15;
		}
		
		if(this.tipoConversion.equals("Celsius") && this.tipoCambio.equals("Rankine")) {
			return resultado = (this.cantidad * 9/5) + 491.67;
		}
		
		//Cambio de Fahrenheit a los demás
		if(this.tipoConversion.equals("Fahrenheit") && this.tipoCambio.equals("Celsius")) {
			return resultado = (this.cantidad - 32) * 5/9;
		}
		
		if(this.tipoConversion.equals("Fahrenheit") && this.tipoCambio.equals("Fahrenheit")) {
			return resultado = this.cantidad;
		}
		
		if(this.tipoConversion.equals("Fahrenheit") && this.tipoCambio.equals("Kelvin")) {
			return resultado = (this.cantidad + 459.67) * 5/9;
		}
		
		if(this.tipoConversion.equals("Fahrenheit") && this.tipoCambio.equals("Rankine") ) {
			return resultado = (this.cantidad + 459.67);
		}
		
		//Cambio de Kelvin a los demás
		if(this.tipoConversion.equals("Kelvin") && this.tipoCambio.equals("Celsius")) {
			return resultado = this.cantidad - 273.15;
		}
				
		if(this.tipoConversion.equals("Kelvin") && this.tipoCambio.equals("Fahrenheit")) {
			return resultado = ((this.cantidad - 273.15) * 1.8) +32;
		}
				
		if(this.tipoConversion.equals("Kelvin") && this.tipoCambio.equals("Kelvin")) {
			return resultado = this.cantidad;
		}
				
		if(this.tipoConversion.equals("Kelvin") && this.tipoCambio.equals("Rankine") ) {
			return resultado = this.cantidad * 1.8;
		}
		
		//Cambio de Rankine a los demás
		if(this.tipoConversion.equals("Rankine") && this.tipoCambio.equals("Celsius")) {
			return resultado = (this.cantidad * 5/9) - 273.15;
		}
						
		if(this.tipoConversion.equals("Rankine") && this.tipoCambio.equals("Fahrenheit")) {
			return resultado = this.cantidad - 459.67;
		}
						
		if(this.tipoConversion.equals("Rankine") && this.tipoCambio.equals("Kelvin")) {
			return resultado = this.cantidad * 5/9;
		}
						
		if(this.tipoConversion.equals("Rankine") && this.tipoCambio.equals("Rankine") ) {
			return resultado = this.cantidad;
		}
		
		return resultado = 0.00;
	}
}
