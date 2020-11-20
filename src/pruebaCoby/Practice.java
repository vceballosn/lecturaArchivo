package pruebaCoby;

public class Practice {

	public static void main(String[] args) {
		// valida si la palabra es un palindromos
		
		String reverseOther ="Arepera";
		
		StringBuilder str = new StringBuilder(reverseOther);
		
		System.out.println(str.reverse().toString());
		
		
		if(reverseOther.equalsIgnoreCase(str.reverse().toString())) {
			System.out.println("la palabra es un palíndromos");
		}else {
			System.out.println("la palabra no es un palíndromos");
		}
	}

}
