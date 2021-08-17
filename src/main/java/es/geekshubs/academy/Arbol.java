package es.geekshubs.academy;

import java.util.Collections;
import java.util.Iterator;

public class Arbol {

  /**
   * Apply Method
   * @param input
   * @return
   */
	public String apply(final Integer input) {
		  String result = "";
		  System.out.println("lado: "+input);
		  

		for (int i = 1;i <= input;i++) {
			result += " ";
			for(int j = 1;j <=input-i;j++) {
				result += " ";
			}
			for(int j = 1;j < i;j++) {
				result += "*";
			}
			result += "\n";
			
		}// fin for
		  
		  result += lado(input); // crea la ultima fila desde el metodo
		  System.out.println(result);
		  
	      return result;
    }// fin aplly
	
	public String lado(int input) { // metodo crea una fila con el numero de "*" dado
		String lado="";
		for (int i = 0; i < input; i++) { //FILA
			
			lado += "*";
		}
		
		return lado;
	}

}// fin clase
