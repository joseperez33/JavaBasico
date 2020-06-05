package Tarea5;

public enum Productos {

	PRODUCTO_1(1, 1000), PRODUCTO_2(2, 2000), PRODUCTO_3(3, 3000), PRODUCTO_4(4, 4000), PRODUCTO_5(5, 5000), PRODUCTO_6(6, 6000), PRODUCTO_7(7, 7000), PRODUCTO_8(8, 8000), PRODUCTO_9(9, 9000), PRODUCTO_10(10, 10000);

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
