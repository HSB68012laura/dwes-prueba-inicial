package tipopago;

import java.util.Date;

public class Cliente {
	private Documentacion id;
	private String nombre;
	private String direccion;
	private String telefono;
	private Date fechaNac;
	private boolean suscripcion = false;
	private TipoPago pagoPref = TipoPago.EFECTIVO;

	public Cliente(Documentacion id, String nombre, String direccion, String telefono, Date fechaNac, boolean suscripcion, TipoPago pagoPref) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.suscripcion = suscripcion ;
		this.pagoPref = pagoPref;
	}
	
	public boolean validarDocumentacion() {
		return id.validar();
	}
	
	public void mostrarDocumentacion( ) {
		id.mostrar();
	}

	public Documentacion getId() {
		return id;
	}

	public void setId(Documentacion id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public boolean isSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(boolean suscripcion) {
		this.suscripcion = suscripcion;
	}

	public TipoPago getPagoPref() {
		return pagoPref;
	}

	public void setPagoPref(TipoPago pagoPref) {
		this.pagoPref = pagoPref;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", fechaNac=" + fechaNac + ", suscripcion=" + suscripcion + ", pagoPref=" + pagoPref + "]";
	}
	
}

