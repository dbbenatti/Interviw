package com.example;
import java.util.LinkedList;
/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 * 
 */
public class TASK2 {
    
    LinkedList<String> listaLigada = new LinkedList<>();
	
	public void adicionarValor(String novoValor) {
		listaLigada.add(novoValor);
	}
	
	public void removerValor(int index) {
		listaLigada.remove(index);
	}
	
	public void imprimirLista() {
		System.out.println(listaLigada);
	}
}
