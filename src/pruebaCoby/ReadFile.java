package pruebaCoby;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadFile {
	
	
	

	
	public static void main(String [] arg) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String respuesta = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\parrafos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         Scanner sc=new Scanner(System.in);
	         respuesta="volutpaty" +sc.nextLine();

	         // Lectura del fichero
	         String linea = new String();
	         int cont1 =0;
	         while((linea=br.readLine())!=null) {
	        	// System.out.println(linea); 
	        	 if(linea.equalsIgnoreCase(respuesta)) {
	        		 cont1 = cont1+1;
	        	 }
	        	 
	        	 
	            
	         }
	         
	         System.out.println("contador "+cont1); 
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
  }
	

