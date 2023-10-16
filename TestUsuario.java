package Persona;

public class TestUsuario {

	public static void main(String[] args) {
		
		//Instancia de usuario
		Usuario felipe = new Usuario("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar la contraseña
		felipe.setPassword("takis"); //error
		System.out.println(felipe.getPassword("DoctorFelie"));
	}

}
