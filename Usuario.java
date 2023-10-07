package Persona;

public class Usuario {
	
	//Atributo
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	public Usuario (String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	} //constructor
	
	//Recuperar contraseña (getter)
	public String getPassword(String usernameAValidar) {
		//Si el usuario registraado coincide con el usuario que paso como parametro, entonces obtengo la contraseña
		if(this.username == usernameAValidar) {
			return password;
		} else {
			System.out.println("Usuario no coincide con uno registrado");
		}
		return usernameAValidar;
	}
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contrasenia es diferente a una cadena vacia y es diferente a la contrasenia anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contrasenia anterior
				password = nuevoPassword;
				System.out.println("Contraseña cambiada exitosamente!");
			}else {
				System.out.println("Lo siento, no puedo cambiar la contrasenia");
			}
		}
	
		//Cambiar la contrasenia de un objeto del tipo usuario
		
		//Felipe.setPassword (una donde la contrasenia este vacia)
		//Felipe.setPassword (una donde la contrasenia no este vacia pero sea igual a la anterior)
		//Felipe.setPassword (se cumplan las dos condiciones)
		

}
