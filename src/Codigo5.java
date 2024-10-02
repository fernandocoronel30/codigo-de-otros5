import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		//En esta linea le falta el System.in e importar el Scanner
		Scanner s = new Scanner(System.in);
		//Aqui se cambia la comilla por comillas
	    System.out.print("Introduzca un número: ");
	    //en esta linea se estaba asignando de tipo string cuando deberia ser tipo int y tambien en la parte de nextLine debe ser nexInt
	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }//else
	    if (afo > noAfo) {
	    	//en esta linea le faltaba la letra t a la palabra println
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }//else	    
	  }//while
	   s.close(); 
	}//main
}//class Codigo5
