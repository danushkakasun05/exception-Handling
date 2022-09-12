import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter candidate age: ");
            int age = input.nextInt();
            Eligibility elg = new Eligibility();
            elg.eligible(age);
        }catch(CustomException e){
            System.out.println("Error:"+e);
        }catch(InputMismatchException e){
            System.out.println("Error new "+e);
        }
        finally{
            System.out.println("HA Ha Ha");
        }

    }
}
