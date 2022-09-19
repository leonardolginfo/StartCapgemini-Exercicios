package com.br.lginfo.ListaUm;

import java.util.Scanner;

public class LerDoisNumerosOperacoesBasicas {
/**
 * Simples código:
 * Faça um algoritmo que receba dois números e ao final mostre a soma, 
 * subtração, multiplicação e a divisão.
 * Obs: Sem usar POO
 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double primeiroNumero = leitor.nextDouble();
		System.out.println("Digite o segundo número:");
		double segundoNumero = leitor.nextDouble();
		leitor.close();
		double soma = primeiroNumero + segundoNumero;
		double subtracao = primeiroNumero - segundoNumero;
		double multiplicacao = primeiroNumero * segundoNumero;
		double divisao = primeiroNumero / segundoNumero;
		System.out.println("Resultados: ");
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.printf("Divisão  %.2f %n " , divisao);
	}

}
