package tipopago;

public class NEmail extends Notificacion {
	private String direccion;
	


public NEmail(long id, String mensaje, String direccion) {
	super (id, mensaje);
	this.direccion = direccion;
}

	public String getNumero() {
		return direccion;
	}

	public void setNumero(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "NEmail [direccion=" + direccion + "]";
	}

	public NEmail(long id, String mensaje) {
		super(id, mensaje);
		// TODO Apéndice de constructor generado automáticamente
	}

}
