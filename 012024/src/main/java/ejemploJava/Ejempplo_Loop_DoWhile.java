package ejemploJava;

public class Ejempplo_Loop_DoWhile {

	public static void main(String[] args) {

		int b = 10;
		
		do {
			//Este codigo dentro del "Do" se imprime incluso si la condiciones del while es falsa
			System.out.println("el valor de B es: " + b);
			b++;
		}while(b <= 20);

	}

}
