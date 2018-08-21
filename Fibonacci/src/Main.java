import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada");
		int quantidade = entrada.nextInt();
		
		int[] n = new int[]{0,0,0};
		
		for(int i = 0; i < quantidade; i++){
			if (i == 0) {
				System.out.print("Saída \n"+n[2]);
				n[2] = 1;
			} else {
				System.out.print(", "+n[2]);
				n[0] = n[1];
				n[1] = n[2];
				n[2] = n[0] + n[1];
			}
		}

	}

}
