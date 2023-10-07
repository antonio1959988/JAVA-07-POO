package Persona;

public class Dentista extends Persona{
	
	//1. Atributos
	/*
	 * Ya no creo valores como nombre, edad, apellido, etc. Porque estos valores los voy a heredar de la clase persona
	 */
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario = 500;
	
	//2. Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad, String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); // informacion de la clase persona
		
		//informacion de la clase dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	} //constructorDentista

	//3 Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40,000, si es avanzado gana 50,000
	
	void calcularSalario() {
		//logica de programacion
		if (experiencia.equals("basico")){
				salario = 30000;
		} else if (experiencia.equals("intermedio")) {
			salario = 40000;
		} else if (experiencia.equals("avanzado")) {
			salario = 50000;
		} 
	}
	
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
	} // cierre imprimirInfoDentista

	@Override
	public String toString() {
		return "Dentista [especialidad=" + especialidad + ", cedula=" + cedula + ", consultorioAsignado="
				+ consultorioAsignado + ", experiencia=" + experiencia + ", turno=" + turno + ", salario=" + salario
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}

	
	
	
	
	
} // cierre de dentista
