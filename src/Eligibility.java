public class Eligibility {
    public void eligible(int age) throws CustomException {
        if (age<18){
            throw new CustomException("invalid age");
        }
        else{
            System.out.println("you can proceed");
        }

    }
}
