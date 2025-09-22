package tipopago;

public class NIF extends Documentacion {

public NIF () {
	//Constructor por defecto
}

public NIF (String numero, char letraFinal) {
	this.numero = numero;
	this.letraFinal = letraFinal;
}

	@Override
	public boolean validar() {
		// Simula la validacion del NIF. Un NIF es correcto si tiene 8 dig, 
		//y finaliza en letra
		return numero.length() ==8 && Character.isLetter(letraFinal);
		
	}

	@Override
	public void mostrar() {
		// Mostrar el Nif por panntalla
		System.out.println ("NIF: "+numero+ "-" + letraFinal);

	}

	@Override
	public String toString() {
		return "NIF [numero=" + numero + ", letraFinal=" + letraFinal + "]";
	}

}
