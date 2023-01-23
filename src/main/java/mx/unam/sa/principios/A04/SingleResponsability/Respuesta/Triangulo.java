package mx.unam.sa.principios.A04.SingleResponsability.Respuesta;

public class Triangulo implements Figura {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double calculaArea() {
		double area = (base * altura) / 2;
		return area;
	}

}
