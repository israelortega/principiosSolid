package mx.unam.sa.principios.A15.DependencyInversion;

public class MySQLConnection
{
    private String database;

    public MySQLConnection(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}
