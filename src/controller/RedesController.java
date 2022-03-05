package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
		
	}
	private static void os() {
		String os = System.getProperty("os.name");
		System.out.println(os);
		
	}
	public void osExibir() {
		RedesController.os();
	}
	
	public void ip() {
		String aux = "";
		String os = System.getProperty("os.name");
		boolean ans = os.contains("Windows");	
		if (ans) {
			try {
				String ip = "IPCONFIG";
				Process p = Runtime.getRuntime().exec(ip);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {
					String[] stringarray = linha.split("\n ");  
					for(int i=0; i< stringarray.length; i++)
					{
					boolean anss = linha.contains("Adaptador");
					boolean anssendereco = linha.contains("   Endere‡o IPv4");
						if(anss){
							aux = linha;
							System.out.equals(stringarray[i]);
							linha = buffer.readLine();
						}		else if(anssendereco) {
							System.out.println(aux);
							System.out.println(stringarray[i]);
							linha = buffer.readLine();
						}		
																	
				else {
							System.out.equals(stringarray[i]);
							linha = buffer.readLine();
					}
						
					}
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch(Exception e){
				e.printStackTrace();
			}
			
			
		}else {
			try {
				String ip = "ifconfig";
				Process p = Runtime.getRuntime().exec(ip);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {
					String[] stringarray = linha.split("\n ");  
					for(int i=0; i< stringarray.length; i++)
					{
					boolean anss = linha.contains("flags");
					boolean anssendereco = linha.contains("        inet ");
						if(anss){
							aux = linha;
							System.out.equals(stringarray[i]);
							linha = buffer.readLine();
						}		else if(anssendereco) {
							System.out.println(aux);
							System.out.println(stringarray[i]);
							linha = buffer.readLine();
						}
																	
				else {
							System.out.equals(stringarray[i]);
							linha = buffer.readLine();
					}
						
					}
					
					}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void ping() {
		String auxiliar;
		String os = System.getProperty("os.name");
		boolean ans = os.contains("Windows");	
		if (ans) {
			try {
				String ip = "ping -4 -n 10 www.google.com.br";
				Process p = Runtime.getRuntime().exec(ip);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {	
					String[] stringarray = linha.split("\n " + " ");  
					for(int i=0; i< stringarray.length; i++)
					{
					boolean anss = linha.contains(" M‚dia");
					if (anss) {
						auxiliar = linha;
						String[] stringarray1 = auxiliar.split(", ");
						for (int j=0; j < stringarray1.length; j++) {
							System.out.equals(stringarray1[j]);
						}
						System.out.println(stringarray1[2]);
						linha = buffer.readLine();
					} else {
						System.out.equals(linha);
						linha = buffer.readLine();
					}
					
					}	
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch(Exception e){
				e.printStackTrace();
			}
			
			
		}else {
			try {
				String ip = "ping -4 -c 10 www.google.com.br";
				Process p = Runtime.getRuntime().exec(ip);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while(linha != null) {
					String[] stringarray = linha.split("\n " + " ");  
					for(int i=0; i< stringarray.length; i++)
					{
					boolean anss = linha.contains("rtt");
					if (anss) {
						auxiliar = linha;
						String[] stringarray1 = auxiliar.split("/");
						for (int j=0; j < stringarray1.length; j++) {
							System.out.equals(stringarray1[j]);
						}
						System.out.println("Media do ping: "+stringarray1[4]);
						linha = buffer.readLine();
					} else {
						System.out.equals(linha);
						linha = buffer.readLine();
					}
					
					}		
				}
				
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
