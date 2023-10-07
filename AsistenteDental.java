package Persona;

public class AsistenteDental {
	
	//Atributos privados
	private String fechaIngreso;
	private double salario;
	
	//2 Constructor publico para poder acceder a el de forma sencilla
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	} //constructor
	
	//3 Metodos
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente () {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	} // Metodo imprimir informacion
	
	//Getter y setters para poder acceder a mis datosprivados y poder realizar operaciones con ellos
	//Sin getters, la informacion aparece en null
	//Sin setters, no puedo cambiar la informacion
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato string
	public String getFechaIngreso() {
		return fechaIngreso;
	}// getter fechaIngreso
	
	//getter para salario
	public double getSalario() {
		return salario;
	} //getter salario
	
	
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	} 
	
	//setter para salario (modificar los datos)
	public void setSalario(double salario) {
		if (salario > 0 && salario < 100) {
			this.salario = salario;
		} //cierre if
	} //cierre setter
	
}