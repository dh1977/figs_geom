public class Cuadrado extends FiguraGeometrica{
    
    private double lado;
    
    public Cuadrado(double l){
        super("cuadrado");
        this.lado = l;
    }
    
    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
    
    @Override
     public double getPerimetro() {
        return 4 * this.lado;
    }

    public double getLado() {
    	return this.lado;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
        
}
