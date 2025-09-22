package tipopago;

public class NTelefonica extends Notificacion {
	private String numero;

	public NTelefonica(long id, String mensaje, String numero) {
		super(id, mensaje);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "NTelefonica [numero=" + numero + "]";
	}

}
