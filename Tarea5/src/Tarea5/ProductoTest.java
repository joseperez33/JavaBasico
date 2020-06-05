package Tarea5;

public class ProductoTest {

	public static void main(String[] args) {

		for (Productos producto : Productos.values()) {

			System.out.println("Codigo: " + producto.getCodigoProducto());
			System.out.println("Producto: " + producto);			
			System.out.println("Valor: " + producto.getValorProducto());
		

		}

	}

}
