package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	//Metodo principal para instanciar mis clases
	public static void main (String[] args) {
		
	/*
	//Instancia de persona
	Persona felipe = new Persona("Juan", "Lopez", (byte)23, "8118838471", "hola@gmail.com");
		
	System.out.println(felipe); //imprime el lugar en memoria
	felipe.imprimirInfo(); //imprime la informacion
	felipe.saludar(); //imprime saludo
	
	//Instancia de Dentista
	Dentista simi = new Dentista("Simi", "Larez", (byte)50, "12345678", "simi@lares.com", "odontologia", "1233", "Consultorio 500", "basico", "matutino", 500);
	
	System.out.println("*****************************");
	simi.calcularSalario();
	simi.imprimirInfoDentista();
	
	//Instancia de paciente con todos los datos
	Paciente chencho = new Paciente("CHENCH1234", "RH+", true, true, "05-10-2023", "Dr.Simi Lares", false);
	
	System.out.println("*****************************");
	System.out.println(chencho);
	
	
	//Instancia de paciente solo con datos obligatorios
	Paciente masiosare = new Paciente("MAS12345", false, false);
	System.out.println("*****************************");
	System.out.println(masiosare);
	
	//cambiar el false de seguroMedico a true
	masiosare.setSeguroGastosMedicos(true);
	masiosare.getSeguroGastosMedicos();
	System.out.println("*****************************");
	System.out.println(masiosare);
	
	*/
		
	//Implementacion de ArrayList de dentistas
	List<Dentista> listaDentistasArrayList = new ArrayList<>();
	
	//Primero una instancia de dentista
	Dentista DrChapatin = new Dentista("Dr. Chapatin", "Chespirito", (byte)50, "12345678", "simi@lares.com", "odontologia", "1233", "Consultorio 500", "basico", "matutino", 500);
	
	//Luego la agrego a la lista
	listaDentistasArrayList.add(DrChapatin);
	
	//Si agrego la instancia a una variable puedo imprimir su informacion usando un toString, o un mostrarInfo();
	
	//Hago una instancia y la agrego directamente a la lista
	listaDentistasArrayList.add(new Dentista("Simi", "Larez", (byte)50, "12345678", "simi@lares.com", "odontologia", "1233", "Consultorio 500", "basico", "matutino", 500));
	
	//Si genero la instancia y la agrego directamente al arrayList, para sacar al dato tendré que utilizar un forEach o algun ciclo para imprimir dato por dato
	
	//Implementacion de lista de dentistas con un hashSet
	Set<Dentista> conjuntoDentistas = new HashSet<>();
	
	//Agregando dentista a mi conjunto
	conjuntoDentistas.add(new Dentista("Simi", "Larez", (byte)50, "12345678", "simi@lares.com", "odontologia", "1233", "Consultorio 500", "basico", "matutino", 500));
	
	//Implementacion de un hashmap de dentistas
	Map<String,Dentista> mapaDentistas = new HashMap<>();
	
	//Agregar un dentista a mi mapa
	mapaDentistas.put("Dr House", new Dentista ("Gregory", "House", (byte)55, "12345678", "greg@house.com", "cirujano", "556654", "Consultorio 600", "avanzado", "vespertino", 1400));
	
	//Imprimir el objeto doctor house
	Dentista doctorBuscado = mapaDentistas.get("Dr House");
	
	System.out.println(doctorBuscado);
	
	
	
	} //cierre metodo main
	
	
	

	
	
}// cierre clase test
