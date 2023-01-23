package mx.unam.sa.principios.A08.Liskov;

public class WriteDocument extends Document {
	public WriteDocument(String fileName) {
		super(fileName);
	}

	public void save() // throws Exception
	{
		System.out.println("A write document can be modified and saved.");

	}
}
