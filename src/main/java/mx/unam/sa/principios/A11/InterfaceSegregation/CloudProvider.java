package mx.unam.sa.principios.A11.InterfaceSegregation;

public interface CloudProvider
{
    void storeFile(String name);
    String getFile(String name);
    void createServer(Region region, String serverName);
    void listServers(Region region);
    String getCDNAddress();
}
