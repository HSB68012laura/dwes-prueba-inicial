package tipopago;

public abstract class Documentacion {

	protected String numero;
	protected char letraFinal;
	
	public abstract boolean validar();
	
	public abstract void mostrar();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getLetraFinal() {
		return letraFinal;
	}

	public void setLetraFinal(char letraFinal) {
		this.letraFinal = letraFinal;
	}
	
	
}
