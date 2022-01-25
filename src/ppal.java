
public class ppal {
	public static void main(String[] args) {
		FiguraGeometrica unaFigura = new FiguraGeometrica("una figura");
		Cuadrado unCuadrado = new Cuadrado(20);
		
		System.out.println("Area de la figura:  " + unaFigura.getArea());
		
		System.out.println("Area del cuadrado: " + unCuadrado.getArea());
		
		unCuadrado.setArea(unCuadrado.getArea());
		System.out.println(unaFigura.toString());
		System.out.println(unCuadrado.toString());
	}
}
