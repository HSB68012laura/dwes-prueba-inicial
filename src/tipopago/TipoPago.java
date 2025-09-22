package tipopago;

public enum TipoPago {
	EFECTIVO ('E', "efectivo"),
	TRANSFERENCIA ('T', "trasnsferencia"),
	CREDITO ('C', "tarjeta de credito");
	
	private final char codigo;
	private final String nombre;
	
	TipoPago (char codigo, String nombre){
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public char getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
