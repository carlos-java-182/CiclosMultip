package tablaMultiplicar;

import javax.swing.JOptionPane;

public class UnoAlDiez {

	public static void main(String[] args) {
		
		int numero = 0;
		
		
		
		do {
		
			numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un número entre el 1 y el 10"));
			
		for(int i=1; i<=10; i++) {
			
			
			
			System.out.println(numero+" x "+i+" = "+numero*i);
		}

	}while(numero>=0 && numero<=10);

}}
