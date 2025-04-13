package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
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
		 System.out.println(num1);
		 
}}
