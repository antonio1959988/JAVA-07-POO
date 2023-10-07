package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		// instancia de nuestro asistente
		
		AsistenteDental francisca = new AsistenteDental("05-10-23", 875.40d);
		
		//Impresion de la informacion de nuestro asistente
		francisca.mostrarDatosAsistente();
		
		//El sueldo de Francisca no es de 875.40 es de 87.5
		
		//Cambio de sueldo
		//francisca.salario = 87.5;
		
		//Mostrar solo el sueldo (antes del getter)
		//System.out.println(francisca.salario);
		
		//Mostrar el sueldo (despues del getter)
		System.out.println(francisca.getSalario());
		
		//Modificar salario con el setter
		francisca.setSalario(30.00); //si cumple la condicion
		
		//imprimir el nuevo salario de francisca
		System.out.println(francisca.getSalario());
	}

}
