import java.util.ArrayList;

public class SchoolManagement
{
    public static void main(String[] args)
    {
        //variables declaration & init
        ArrayList<Person> schoolPeople = new ArrayList<>();

        schoolPeople.add(new Student("Giancarlo Conti", 10, "5C"));
        schoolPeople.add(new Student("Ruggero De Cegli", 18, "5A"));
        schoolPeople.add(new Teacher("Gianluca De Cegli", 40, "Science"));
        schoolPeople.add(new Teacher("Spongebob", 30, "Spongeboblogia"));

        for (Person schoolPerson : schoolPeople)
        {
            schoolPerson.roleDescription();

            //if the school person implements the
            //registrable interface
            if(schoolPerson instanceof Registrable)
            {
                ((Registrable)schoolPerson).registration();
            }
        }
    }
}
