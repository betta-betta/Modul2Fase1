import java.util.ArrayList;

public class Modul2Fase1 {

public static void main(String[] args) {
		

		Character[] nom = new  Character[5];
		nom [0]=('L');
		nom [1]=('l');
		nom [2]=('u');
		nom [3]=('i');
		nom [4]=('s');
		
		System.out.println("Total de posicions al ArrayList son : "+nom.length);
		System.out.println("");
		for(int i=0;i<nom.length;i++) {
			
			System.out.println("Les lletres del array són:  "+ nom[i]);
		}
	}	
			
}