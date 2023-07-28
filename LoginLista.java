package login_package;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginLista {

	public static void main(String[] args) {
		
		ArrayList<String> usuarios = new ArrayList<>();
		usuarios.add("UsuarioUno");
		usuarios.add("UsuarioDos");
		usuarios.add("UsuarioTres");
		usuarios.add("UsuarioCuatro");
		usuarios.add("UsuarioCinco");
		usuarios.add("UsuarioSeis");
		usuarios.add("UsuarioSiete");
		usuarios.add("UsuarioOcho");
		usuarios.add("UsuarioNueve");
		usuarios.add("UsuarioDiez");
		
		ArrayList<Integer> contrasenias = new ArrayList<>();
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		contrasenias.add(1234);
		
		Scanner entrada = new Scanner(System.in);
		Scanner entradaDos = new Scanner(System.in);
		String usuarioIngresado;
		int contraseniaIngresada;
		boolean flag = false;
		
		System.out.println("Ingresa tu nombre de usuario");
		usuarioIngresado = entrada.next();
		
		System.out.println("Ingresa tu contraseña");
		contraseniaIngresada = entradaDos.nextInt();
		
		for(int i = 0; i < usuarios.size(); i++){
			
			if(usuarioIngresado.equals(usuarios.get(i)) && contraseniaIngresada == contrasenias.get(i)){
				System.out.println("Bienvenido " + usuarioIngresado);
				flag = true;
				break;
			}

		}
		
		if(!flag){
			System.out.println("Usuario o contraseña incorrectos...");
		}

	}

}
