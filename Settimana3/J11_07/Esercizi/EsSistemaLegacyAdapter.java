import java.util.ArrayList;

interface UserManagement
{
    public void createUser();
    public void deleteUser();
    public void findUser();

    public void usrNotify();
}

class LegacyUserSystem
{
    public void addUser()
    {
        System.out.println("Adding a user (legacy)");
    }

    public void removeUser()
    {
        System.out.println("Removing a user (legacy)");
    }

    public void searchUser()
    {
        System.out.println("Searching a user (legacy)");
    }
}

class UserManagementAdapter implements UserManagement
{
    //declaring instance variables
    private LegacyUserSystem legacySystem;
    private int instanceCount = 0;

    //constructor method
    public UserManagementAdapter()
    {
        legacySystem = new LegacyUserSystem();
        instanceCount++;
    }

    public void createUser()
    {
        legacySystem.addUser();
    }

    public void deleteUser()
    {
        legacySystem.removeUser();
    }

    public void findUser()
    {
        legacySystem.searchUser();
    }

    //observer notify
    public void usrNotify()
    {
        System.out.println("Notify instance " + instanceCount);
    }
}

class NewUserManagement implements UserManagement
{
    //declaring instance variables
    private int instanceCount = 0;

    //constructor method
    public NewUserManagement()
    {
        instanceCount++;
    }

    public void createUser()
    {
        System.out.println("Creating a user");
    }

    public void deleteUser()
    {
        System.out.println("Removing a user");
    }

    public void findUser()
    {
        System.out.println("Finding a user");
    }

    //observer notify
    public void usrNotify()
    {
        System.out.println("Notify instance " + instanceCount);
    }
}

//singleton class
class UserManagementCenter
{
    private static UserManagementCenter instance; //private instance of the singleton class
    private ArrayList<UserManagement> userManagements; // observing user managements
    private UserManagement currentUserManagement; //using a strategy

    //private constructor to avoid direct instance
    private UserManagementCenter()
    {
        userManagements = new ArrayList<>();
        currentUserManagement = null;
    }

    // returns the unique instance of this class
    public static UserManagementCenter getInstance()
    {
        // creates a unique instance if not existing
        if (instance == null)
        {
            instance = new UserManagementCenter();
        }

        // returns the unique instance
        return instance;
    }

    //changes what type of user management to use (changes strategy)
    public void setCurrentUserManagement(UserManagement usrMgt)
    {
        currentUserManagement = usrMgt;

        if(!userManagements.contains(currentUserManagement))
        {
            addUserManagement(currentUserManagement);
        }
    }

    //registers a new user management to the observer list
    public void addUserManagement(UserManagement usrMgt)
    {
        userManagements.add(usrMgt);
    }

    //removes a user management from the observer list
    public void removeUserManagement(UserManagement usrMgt)
    {
        userManagements.remove(usrMgt);

        //removes the currentUserManagement from the strategy
        //if the usrMgt, removed from the observer, is equal to this one
        if(currentUserManagement == usrMgt)
        {
            currentUserManagement = null;
        }
    }
}

public class EsSistemaLegacyAdapter
{
    public static void main(String[] args)
    {
        //adapter using the legacy system
        UserManagementAdapter integratedUserManagement = new UserManagementAdapter();
        NewUserManagement newUserManagement = new NewUserManagement();

        //user management center singleton
        UserManagementCenter usrMgtCenter = UserManagementCenter.getInstance();

        integratedUserManagement.createUser();
        integratedUserManagement.deleteUser();
        integratedUserManagement.findUser();

        usrMgtCenter.setCurrentUserManagement(integratedUserManagement);
        usrMgtCenter.setCurrentUserManagement(newUserManagement);
    }
}
