package mx.unam.sa.principios.A16.DependencyInversion;

public class MongoDBConnection
{
    private String database;

    public MongoDBConnection(String database)
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
