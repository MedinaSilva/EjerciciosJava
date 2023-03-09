import java.util.GregorianCalendar;

public class Practica1 {
	
	static void primerMetodo (int a, int b, int c) {
		float s = (a+b+c)/2f;
		float areaTriangle = (float)Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		if ((a+b>c) && (b+c>a) && (a+c>b))
			System.out.println("Es un triangulo y su área es: " + areaTriangle);
		else
			System.out.println("No es un triangulo");
		
		
	}

	static void segundoMetodo (int r) {
		float circunferencia = (float) (2*Math.PI*r);
		float areaCirculo =(float) (Math.PI*Math.pow(r,2));
		System.out.println("La circunferencia es: "+circunferencia);
		System.out.println("El área del circulo es: "+areaCirculo);
	}
	
	//static void terceroMetodo (String horario) {
		//String horario = DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a");
		//System.out.println(horario);
	//}
	
	static void cuartoMetodo (int segTotales) {
		int hr=segTotales/3600;
		int min = (segTotales-(3600*hr))/60;
		int seg = segTotales-((hr*3600)+(min*60));
		
		System.out.println(segTotales +" segundos equivalen a: "+hr +"horas "+ min+"minutos "+seg+ "segundos");
	}
	
	static void quintoMetodo (int r) {
		double volumenEsfera = (4*(Math.PI)*(Math.pow(r,3)))/3;
		System.out.println("El volumen de la esfera es: "+volumenEsfera);
		
	}
	
	static void sextoMetodo (int r, int h) {
		double volumenCono = (Math.PI*(Math.pow(r,2)*h))/3;
		System.out.println("El volumen del cono es: "+volumenCono);
		
	}
	
	static void septimoMetodo (int a) {
		//As = a**2+a**2+a**2+a**2+a**2+a**2 = 6(a**2)
		double areaSuperficial = 6*Math.pow(a, 2);
		System.out.println("El área superficial es: "+areaSuperficial);
		
	}
	
	static void octavoMetodo (int anio) {
		GregorianCalendar calendar = new GregorianCalendar();
		if(calendar.isLeapYear(anio))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año es no bisiesto");
		
	}
	
	public static void main(String[] args) {
		
		primerMetodo(2,4,3);
		segundoMetodo(6);
		//tercerMetodo(instant);
		cuartoMetodo(3893);
		quintoMetodo(8);
		sextoMetodo(8,18);
		septimoMetodo(5);
		octavoMetodo(1992);
	}

}
