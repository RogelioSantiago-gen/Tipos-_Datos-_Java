
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * Tipos de datos Java
 
 * Numericos: byte, short, int, log, float(numeros decimales), double
 * byte 8 bits
 * short 16 bits
 * int 32 bits
 * long 64 bits
 * 
 * Booleanos: (verdadero, falso) : boolean
 * Caracteres: char
 * Cadenas: String
 */
		
		byte numeropequeno = 122;
		byte otronumeropequeno = 122;
		int  suma = numeropequeno *  otronumeropequeno;
		
		System.out.println(suma);
		
		
		/*int numero1 = 1000;
		long numero2 = numero1;
		float numero3 = numero2;*/
		
		long numero1 = 1000;
		int numero2 = (int)numero1;
		float numero3 = numero2;
	
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);

		
		
	}
	
   
}
