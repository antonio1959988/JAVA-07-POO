package Persona;

public class TestUsuario {

	public static void main(String[] args) {
		
		//Instancia de usuario
		Usuario felipe = new Usuario("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar la contraseña
		felipe.setPassword("paracetamol1"); //error
	}

}
