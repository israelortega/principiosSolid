package mx.unam.sa.principios.A12.InterfaceSegregation;

public class Dropbox implements CloudStorage
{
    @Override
    public void storeFile(String name)
    {
        System.out.println("Dropbox is storing file " + name);
    }

    @Override
    public String getFile(String name)
    {
        return "Dropbox file " + name;
    }
}
