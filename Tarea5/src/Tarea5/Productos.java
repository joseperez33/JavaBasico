package Tarea5;

public enum Productos {

	PRODUCTO1(1, 100), PRODUCTO2(2, 200), PRODUCTO3(3, 300), PRODUCTO4(4, 400);

	private final int codigoProducto;
	private final int valorProducto;

	private Productos(int codigoProducto, int valorProducto) {
		this.codigoProducto = codigoProducto;
		this.valorProducto = valorProducto;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public int getValorProducto() {
		return valorProducto;
	}

}
