package Tarea5;

import java.util.ArrayList;
import java.util.Scanner;


/***
 * 
 * @author jose.perez @since05/06/2020
 * @version 1
 *
 */

public class Tienda {

	static Scanner teclado = new Scanner(System.in);
	static int opcion, numeroDocumento, busqueda, codidoProducto, cantidad, opcionSalir, valorParcial, contador,valorTotal,crear;
	static String nombrePersona,tipoDocumento;

	public void menuPrincipal() {

		System.out.println("Bienvenido a la Tienda");
		System.out.println("1. Digitar Cliente");
		System.out.println("2. Venta");
		System.out.println("3. Salir");
		System.out.print("Digite la opcion: ");
	}

	public void menuProducto() {
		System.out.println("       PRODUCTOS  : ");
		for (Productos pt : Productos.values())
			System.out.println(pt.getCodigoProducto() + ": " + pt);
	}

	
	public void valorProducto(int codigo) {
		System.out.println("VALOR PRODUCTO: ");
		for (Productos p : Productos.values())
			if (p.getCodigoProducto() == codigo)
				System.out.println(p.getCodigoProducto() + ": " + p + " Valor: " + p.getValorProducto());
	}
	
	
	public void valorUnitario(int codigo) {
		for (Productos p : Productos.values())
			if (p.getCodigoProducto() == codigo)
				System.out.print("-------"+p.getValorProducto());
	}

	public void nombreProducto(int codigo) {
		for (Productos p : Productos.values())
			if (p.getCodigoProducto() == codigo)
				System.out.print(p);
	}

	public void valorCantidad(int codigo, int cantidad) {
		System.out.println("TOTAL COMPRA PRODUCTO: ");
		for (Productos p : Productos.values())
			if (p.getCodigoProducto() == codigo)
				valorParcial = p.getValorProducto() * cantidad;
		System.out.println(valorParcial);
	}

	public static void main(String[] args) {
		DatosPersona  dp = new DatosPersona();
		ArrayList<DatosPersona> al1 = new ArrayList<DatosPersona>();
		ArrayList<Venta> al2 = new ArrayList<Venta>();
		
		for (int i = 0; i < 1; i++) {
			al1.add(dp);
		}
		
		
		Tienda t = new Tienda();
		t.menuPrincipal();
		
		opcion = dp.teclado.nextInt();

		while (opcion != 3) {

			switch (opcion) {
			case 1:
				
				System.out.println("Digite el tipo de documento");
				tipoDocumento =  teclado.next();
				System.out.println("Digite el numero de documento");
				numeroDocumento =  teclado.nextInt();
				System.out.println("Digite el nombre dela persona");
				nombrePersona =  teclado.next();
				
				
				 for (int i = 0; i < al1.size(); i++) {
					  crear = 0;
					  if ( (numeroDocumento == al1.get(i).numeroIdentificacion))
					  {  System.out.println("cliente ya existe: " + al1.get(i).nombreCompleto);
					     i = al1.size();
					  }else {
						  crear = 1;
					  }
				  }
			     
				  if (al1.size() < 1) crear = 1;
				  if (crear == 1) {
					  dp.tipoIdentificacion = tipoDocumento;
					  dp.numeroIdentificacion = numeroDocumento;
					  dp.nombreCompleto = nombrePersona;
					  
					  for (int i = 0; i < 2; i++) {
						  al1.add(dp);
					   	}
					  System.out.println("Cliente no existe , se creo el cliente.");
				  }		
				
				t.menuPrincipal();
				opcion = teclado.nextInt();
				break;
			case 2:
				codidoProducto = 0;
				cantidad = 0;
				t.menuProducto();
				System.out.println("Presione 0 (cero) para finalizar la venta - 1  para continuar:");
				opcionSalir = teclado.nextInt();

				while (opcionSalir != 0) {
					System.out.println("SELECCIONE EL CODIGO PRODUCTO:");
					codidoProducto = teclado.nextInt();
					t.valorProducto(codidoProducto);
					System.out.println("INGRESE LA CANTIDAD:");
					cantidad = teclado.nextInt();
					t.valorCantidad(codidoProducto, cantidad);

					Venta rv = new Venta(dp.nombreCompleto, dp.numeroIdentificacion, codidoProducto, cantidad, valorParcial);
					for (int i = 0; i < 1; i++) {
						al2.add(contador, rv);
					}
					System.out.println("Presione 1 para finalizar la venta - 0 (cero) para continuar:");
					opcionSalir = teclado.nextInt();
					contador = contador + 1;
				}

				if (opcionSalir == 0) {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("- Identificación: " + dp.numeroIdentificacion);
					System.out.println("- Cliente: " + dp.nombreCompleto);
					System.out.println("COD--------PRODUCTO-----------VU------CANTIDAD-------------TOTAL-------");
					for (int i = 0; i < al2.size(); i++) 
					{
						codidoProducto = al2.get(i).codigoProducto ;

						   System.out.print(codidoProducto + "----------");
						   t.nombreProducto(codidoProducto);
						   t.valorUnitario(codidoProducto);
						   System.out.println( "-------"+ al2.get(i).getCantidad() +"---------"+ al2.get(i).getTotal());
						   valorTotal= valorTotal + al2.get(i).getTotal();
						}
					System.out.print("-TOTAL COMPRA:----------------------------------");
					System.out.println("$"+valorTotal);
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("");
				}
				contador = 0;
				t.menuPrincipal();
				opcion = teclado.nextInt();
				break;
			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Error, opción no valida");
				t.menuPrincipal();
				break;
			}

		}

	}

}
