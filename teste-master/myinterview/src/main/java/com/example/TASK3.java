package com.example;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {
    //Cria um arraylist
    private ArrayList<String> lista = new ArrayList<>();
	
    //metodo que adciona uma string na lista
	public void adicionarValor(String valor) {
		lista.add(valor);
	}
    //metodo que ordena a lista pra futuramente fazer a comparação de forma adequada
	public void ordenarLista(){
		Collections.sort(lista);
	}
	
	//metodo que faz a comparação das strings e ve quantas são distintas
	public void imprimirLista() {
		int count = 0;
		for(int i=0;i<lista.size()-1;i++){
		if(lista.get(i).equals(lista.get(i+1))){
						
		}else{
			count++;
		}
		}
		if(count==0){
			System.out.println(lista+""+"Só existe "+(count+1)+" tipo de String");
		}else{
			System.out.println(lista+""+"O numero de strings distintas são: "+(count+1));
		}
		
	}
}
