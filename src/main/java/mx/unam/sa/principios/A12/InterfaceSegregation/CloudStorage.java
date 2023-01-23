package mx.unam.sa.principios.A12.InterfaceSegregation;

public interface CloudStorage {
	void storeFile(String name);
    String getFile(String name);
}
