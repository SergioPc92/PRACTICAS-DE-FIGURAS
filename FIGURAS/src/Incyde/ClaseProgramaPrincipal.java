package Incyde;

public class ClaseProgramaPrincipal {

	public static void main(String[] args) {
		Triangulo trianguloAngela = new Triangulo();
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes; 
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base =5f;
		trianguloAngela.altura=8f;
		System.out.println(trianguloAngela.toString());
		System.out.println("El areas es" + trianguloAngela.area());
		
		Triangulo trianguloSergio = new Triangulo();
		float[] tempLongitudes1 = {2,3,5};
		trianguloSergio.longitudes = tempLongitudes1; 
		System.out.println("El perimetro es " + trianguloSergio.perimetro());
		trianguloSergio.base = 10f;
		trianguloSergio.altura = 12f;
		System.out.println(trianguloSergio.toString());
		System.out.println("El areas es" + trianguloSergio.area());
	}
}
