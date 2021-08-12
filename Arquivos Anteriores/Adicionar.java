package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adicionar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu=1;
		
		do{
		Scanner ler = new Scanner(System.in);
		List<String> estoque = new ArrayList<String>();// Adiciona novo objeto chamo "estoque" vetor do  list string
		
		System.out.println("\nInsira o nome do novo produto");
		estoque.add(ler.nextLine());//adiciona um elemento no ArrayList
		System.out.println("\nNovo produto adicionado");
		System.out.println(estoque);// exibe produtos da lista
		}
		while(menu!=0);
	}
}