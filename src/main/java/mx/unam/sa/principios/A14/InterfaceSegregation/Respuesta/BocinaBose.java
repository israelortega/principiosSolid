package mx.unam.sa.principios.A14.InterfaceSegregation.Respuesta;

public class BocinaBose implements Bocina, Karaoke, Radio {

	private String modelo;

	public BocinaBose(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void karaoke() {
		// TODO Auto-generated method stub
		System.out.println("Poniendo karaoke con la bocina " + modelo);
	}

	@Override
	public void radio() {
		// TODO Auto-generated method stub
		System.out.println("Escuchando la radio con la bocina " + modelo);
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo bocina Bose modelo: " + modelo);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando bocina Bose modelo: " + modelo);
	}

}
