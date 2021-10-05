import java.util.Scanner;

public class NameGenerator
{
    Scanner kboard = new Scanner(System.in);


    private String surname;
    private String forename;
    private String motherMaiden;
    private String placeOfBirth;
    private String starWarsName;

    //Generates a new starwars name from user input
    public NameGenerator()
    {
        this.setSurname();
        this.setForename();
        this.setMotherMaiden();
        this.setPlaceOfBirth();
        this.generateStarWarsName();
    }

    //Generates a new starwars name from parametes hardcoded
    public NameGenerator(String firstName, String lastName, String maidenName, String pob)
    {
        this.surname = lastName;
        this.forename = firstName;
        this.motherMaiden = maidenName;
        this.placeOfBirth = pob;
        this.generateStarWarsName();
    }

    //Set surname method to get users surname
    public void setSurname()
    {
        System.out.println("Please enter your surname: ");
        this.surname = kboard.next();
    }

    //set forename method to get users first name
    public void setForename()
    {
        System.out.println("Please enter your forename: ");
        this.forename = kboard.next();
    }

    //setmothermaiden name method to get users mothers maiden name
    public void setMotherMaiden()
    {
        System.out.println("Please enter your mother's maiden name: ");
        this.motherMaiden = kboard.next();
    }

    //Method to get users place of birth
    public void setPlaceOfBirth()
    {
        System.out.println("Please enter your place of birth: ");
        this.placeOfBirth= kboard.next();
    }

    //method to generate star wars name
    public void generateStarWarsName()
    {
        String swForename;
        String swSurname;

        //Creates star wars forename with the first char capitalised
        swForename = this.surname.substring(0, 3)+this.forename.substring(0,2);
        swForename = swForename.substring(0, 1).toUpperCase() + swForename.substring(1).toLowerCase();

        //Creates star wars surname with the first char capitalised
        swSurname = this.motherMaiden.substring(0, 2)+this.placeOfBirth.substring(0,3);
        swSurname = swSurname.substring(0, 1).toUpperCase() + swSurname.substring(1).toLowerCase();

        this.starWarsName = swForename + " " + swSurname;
    }

    // method to display star wars name
    public void displayStarWarsName()
    {
        System.out.println("Your Star Wars name is: " +this.starWarsName);
    }
}
