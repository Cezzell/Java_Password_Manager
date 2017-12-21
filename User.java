import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class User {

    // inputLine is the way we read from the user
    public BufferedReader inputLine;
    public String fileName;
    public FileWriter file;
    private Random rand;

    /*
     * User values
     * fName: holds first name
     * lName: holds last name
     * ID: holds a unique identifier
     * salt: unique, used for encryption
     */
    public static String fName;
    public static int ID;
    public static String lName;
    public static int salt;


    /*
     * The only constructor for a User
     */
    public User(String first, String last){
        fName = first;
        lName = last;

        // Will likely be determined by database in the future.
        ID = rand.nextInt();

        // Essential for encryption
        salt = rand.nextInt();
    }

    /*
     * Setters and Getters
     * The ID and salt fields cannot be changed.
     */

    public setName(String newfName, String newlName){
        fName = newfName;
        lName = newlName;
    }

    public getName(){
        return this.fName + ' ' + this.lName;
    }

    public getID(){
        return this.ID;
    }

    public getSalt(){
        return this.salt;
    }




        /*
        inputLine = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Username:");
        userName = inputLine.readLine().trim();
        fileName = "./" + userName;

        File fileHandle = new File(fileName);
        FileWriter file = new FileWriter(System.out);


        System.out.println("Enter your password:");

        */
}
