package tipopago;

import java.util.Date;

public class Notificacion {
	
	protected long id;
	protected Date fecha;
	protected String mensaje;
		
		
		
	public Notificacion(long id, String mensaje) {
		this.id = id;
		this.fecha = new Date();
		this.mensaje = mensaje;
		}
	
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public Date getFecha() {
		return fecha;
	}
	
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	public String getMensaje() {
		return mensaje;
	}
	
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
		@Override
	public String toString() {
		return "Notificacion [id=" + id + ", fecha=" + fecha + ", mensaje=" + mensaje + "]";
	}
}
