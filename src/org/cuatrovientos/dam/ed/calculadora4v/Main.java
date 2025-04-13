package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String respuesta;
		
		System.out.println("Qué desea: Factorial o Operación básica (F/O)");
		respuesta=scanner.nextLine();
		switch (respuesta) {
		
		//Caso Operacion
		case "O":
			int num1=0, num2=0, resultado=0;
			String operacion;
			
			//Se pide que operacion desea hacer
			System.out.println("¿Qué operacion desea hacer?(+,-,x,/)");
			operacion = scanner.nextLine();		
			
			//Introduce los dos numeros
			System.out.println("Introduce el primer numero");
			num1 = scanner.nextInt();
			System.out.println("Introduce el segundo numero");
			num2 = scanner.nextInt();
			
			//Se realiza la operacion deseada
			 switch (operacion) {
	         case "+":
	             resultado = num1 + num2;
	             break;
	         case "-":
	             resultado = num1 - num2;
	             break;
	         case "x":
	             resultado = num1 * num2;
	             break;
	         case "/":
	        	 //Si el divisor es 0 no se puede hacer porque el resultado seria infinito
	             if (num2 == 0) {
	                 System.out.println("Error: No se puede dividir entre cero.");
	                 return;
	             }else {
	            	 resultado = num1 / num2;
	            	 break;
	             }
	         default:
	        	 System.out.println("No se selecciono ninguna operacion válida");
	        	 return;
			 }
			 //Se devuelve la operacion con el resultado
			 System.out.println("El resultado de "+num1+operacion+num2+" es igual a "+resultado);
			 
		//Caso Factorial
		case "f":
			int num, i, total=1;
			String numStr;
			//Se pide un numero mayor que 0 para hacer el factorial
			do {
			System.out.println("Introduce un numero entero (>0): ");
			numStr = scanner.nextLine();
			num = Integer.parseInt(numStr);
			}while (num < 0);
			
			System.out.println("El factorial de " + num + " es: ");
			i = 1;
			//Se calcula el factorial con un bucle
			while (i <= num) {
				total = total * i;
				i++;			
			}
			System.out.print(total);
		//Por si no da una de las dos opciones posibles
		default:
			System.out.println("Da una de las dos posibles 'F' o 'O'");
	}
	}
		
		

}
