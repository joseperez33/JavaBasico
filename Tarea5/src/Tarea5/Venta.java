package Tarea5;

public class Venta {
	String nombre;
	int numeroIdentificacion, codigoProducto, cantidad, total;

	public Venta(String nombre, int numeroIdentificacion, int codigoProducto, int cantidad, int total) {
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.total = total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
