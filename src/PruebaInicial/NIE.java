package tipopago;

public class NIE extends Documentacion {
		
	private char letraInicial;

	public NIE() {
	}
	
	public NIE (String numero, char letraInicial, char letraFinal) {
		this.numero = numero;
		this.letraInicial = letraInicial;
		this.letraFinal = letraFinal;
	}
	
	@Override
	public boolean validar() {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public void mostrar() {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public String toString() {
		return "NIE [letraInicial=" + letraInicial + ", numero=" + numero + ", letraFinal=" + letraFinal + "]";
	}
	

}
