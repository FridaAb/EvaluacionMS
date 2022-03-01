package test.entityserviceclientesv1.entity;

//POJO
public class Cliente {
	
	int clienteId;
	String nombre;
	String correo;
	
	
	public Cliente() {
		
	}

	public Cliente(int clienteId, String nombre, String correo) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.correo = correo;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", correo=" + correo + "]";
	}

}
