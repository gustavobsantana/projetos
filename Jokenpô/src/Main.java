import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Jogador 1: PEDRA, PAPEL, TESOURA");
		String j1 = entrada.next();

		System.out.println("Jogador 2: PEDRA, PAPEL, TESOURA");
		String j2 = entrada.next();

		String resultado = "";

		if (j1.equalsIgnoreCase(j2)) {
			resultado = "EMPATE";
		} else {
			
			if (j1.equalsIgnoreCase( "PEDRA")) {
				if (j2.equalsIgnoreCase( "TESOURA")) {
					resultado = "jogador 1";
				}else if(j2.equalsIgnoreCase( "PAPEL")){
					resultado = "jogador 2";
				}
			}

			if (j1.equalsIgnoreCase( "PAPEL")) {
				if (j2.equalsIgnoreCase( "PEDRA")) {
					resultado = "jogador 1";
				}else if(j2.equalsIgnoreCase( "TESOURA")){
					resultado = "jogador 2";
				}
			}

			if (j1.equalsIgnoreCase( "TESOURA")) {
				if (j2.equalsIgnoreCase( "PAPEL")) {
					resultado = "jogador 1";
				}else if(j2.equalsIgnoreCase( "PEDRA")){
					resultado = "jogador 2";
				}
			}

		}
		System.out.println("Resultado: "+resultado);
	}

}
