package pruebaCoby;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Read {

	public static void main(String[] args) throws FileNotFoundException {
	    File fichero = new File ("C:\\parrafos.txt");

	    Scanner sc=new Scanner(System.in);
	    String respuesta;

	    try {
	    	do {
	            BufferedReader br=new BufferedReader(new FileReader(fichero));
	            System.out.println("Introduco un nombre que quieras buscar: ");
	            respuesta=sc.nextLine();

	            String linea="";
	            int contRepetidas =0;
	            StringBuilder lineasBus = new StringBuilder();
	            StringBuilder numLineas = new StringBuilder();
	            String palabraBuscada = respuesta;
	            int cont_linea=0;
	            
	            while ((linea= br.readLine())!=null) {
	            	System.out.println(linea);
	            	System.out.println(respuesta.toString());
	            	cont_linea =cont_linea+1;
	            	StringTokenizer st = new StringTokenizer(linea);
	                while (st.hasMoreTokens()) {
	                    if(st.nextToken().equalsIgnoreCase(respuesta)) {
	                    	contRepetidas=contRepetidas+1;
	                    	numLineas =numLineas.append(cont_linea +","+numLineas);
	                    	lineasBus = lineasBus.append("Nro de Linea:"+ cont_linea +" Contenido Linea: "+linea) ;
	                    }
	                }
	            	

	            }

	                System.out.println("¿Quieres introducir otro nombre?");
	                respuesta=sc.nextLine();
	                System.out.println(" palabra Buscada " + palabraBuscada);
                    System.out.println("veces que se repite la palabra " + contRepetidas);
                    System.out.println("lineas encontradas " + lineasBus.toString());
                    System.out.println("Nro de lieneas encontradas " + numLineas.toString());
	        }while(respuesta.equalsIgnoreCase("si"));
	    } catch (IOException e) {

	        System.out.println("Error");
	    }

	}

}
