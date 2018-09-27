package com.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
 * AWS s3 bucket => interview-digiage
 *
 */
public class TASK4 {

    @SuppressWarnings("null")
	public static void main(String[] args) {
		// Este código eu aprendi usando uma video aula de um curso de android que eu tenho na udemy
		try{		
			URL url =  new URL("https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda");//pega a url
			HttpURLConnection conexao = (HttpURLConnection)url.openConnection();//abre a conexão com a url
			//recuperar dados em bytes
			InputStream inputStream = conexao.getInputStream();
			//transforma os dados de bytes em caracteres
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			//Objeto que faz a leitura dos caracteres do InputStreamReader
			BufferedReader reader = new BufferedReader(inputStreamReader);	
            //Imprimi o readers		
			System.out.println(reader.readLine());
			
			
			}
		catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
		catch(IOException e2){
			e2.printStackTrace();
		}
	}

}