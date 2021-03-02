
public class Modul2Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=4;
int num2=0;

boolean resultado=suma(num1,num2);


if(resultado) {
	System.out.println( resultado);
}
else {
	System.out.println(resultado);
}
/*if (suma(num1,num2)) {
	System.out.println(" valor es mayor de 0 o ");
}
else {
	System.out.println("El valor es menor que 0 o ");
}*/

//System.out.println("el resutado de la suma es: "+resultado);

	}
public static boolean suma(int num1,int num2) {
	int resultado=num1+num2;
	if(resultado>0) {
		return true;
		
	}
	else {
		return false;
	}
	
	}
}

