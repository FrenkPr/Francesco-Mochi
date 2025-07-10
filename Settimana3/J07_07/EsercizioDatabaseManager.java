import java.util.ArrayList;

//Singleton class
class DbClientConnection
{
    // private static singleton instance
    private static DbClientConnection instance;
    private static int connectionsCount;
    private ArrayList<String> clientIds;

    // private constructor (not direct instance allowed)
    private DbClientConnection()
    {
        connectionsCount = 0;
        clientIds = new ArrayList<>();
    }

    // returns the unique instance of the object
    public static DbClientConnection getInstance()
    {
        //creates the unique instance if not existing
        if (instance == null)
        {
            instance = new DbClientConnection();
        }

        // returns the instance
        return instance;
    }

    public void connect(String clientId)
    {
        if(clientIds.contains(clientId))
        {
            System.out.println("Client " + clientId + " has already connected to the DB");
            return;
        }

        clientIds.add(clientId);
        connectionsCount++;

        System.out.println("Client " + clientId + " connected to the database successfully.\nCurrent clients connected: " + connectionsCount);
    }

    public static int getConnectionsCount()
    {
        return connectionsCount;
    }
}

public class EsercizioDatabaseManager
{
    public static void main(String[] args)
    {
        //init clients variable
        ArrayList<DbClientConnection> clients = new ArrayList<>();
        ArrayList<String> clientIds = new ArrayList<>();
        boolean clientsOfTheSameInstance = true;

        //adding the same instance to different clients
        clients.add(DbClientConnection.getInstance());
        clients.add(DbClientConnection.getInstance());
        clients.add(DbClientConnection.getInstance());
        clients.add(DbClientConnection.getInstance());
        
        // clients.add(null); //if added to the list, the instance won't be the same anymore

        clientIds.add("ICC");
        clientIds.add("PCB");
        clientIds.add("336");
        clientIds.add("45C");
        
        // clientIds.add("PC4"); //if added to the list, the instance won't be the same anymore

        System.out.println("Current clients connected to the DB: " + DbClientConnection.getConnectionsCount());

        //connects clients to the DB
        for (int i = 0; i < clients.size(); i++)
        {
            if(clients.get(i) == null)
            {
                continue;
            }

            clients.get(i).connect(clientIds.get(i));
        }

        //checks if all client instances are the same
        for (int i = 0; i < clients.size() && clientsOfTheSameInstance; i++)
        {
            for (int j = 0; j < clients.size(); j++)
            {
                if(i == j)
                {
                    continue;
                }

                if(clients.get(i) != clients.get(j))
                {
                    clientsOfTheSameInstance = false;
                    break;
                }
            }
        }

        //prints out same intance check message
        if(clientsOfTheSameInstance)
        {
            System.out.println("All clients belong to the same instance");
        }

        else
        {
            System.out.println("Clients do not belong to the same instance");
        }

        //prints out that the client is already connected
        clients.get(0).connect(clientIds.get(0));
    }
}
