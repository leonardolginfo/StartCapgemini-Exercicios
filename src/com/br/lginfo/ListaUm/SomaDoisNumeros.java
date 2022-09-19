package com.br.lginfo.ListaUm;

import java.util.Scanner;

public class SomaDoisNumeros {

	/**
	 * Simples código para ler dois números e mostrar a soma entre eles
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = leitor.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = leitor.nextInt();
		leitor.close();
		int soma = primeiroNumero + segundoNumero;
		//maneira mais verbosa
		System.out.println("A soma entre " + primeiroNumero + " e " + segundoNumero + " é " + soma );
	}

}
