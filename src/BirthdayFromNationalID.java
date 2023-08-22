import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayFromNationalID {

    static  String gender;
    static int number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 12-digit National ID: ");
        String nationalID = scanner.next();

        char ch = nationalID.charAt(4);
        if (Character.isDigit(ch)) {
            number = Character.getNumericValue(ch);
        }



        scanner.close();

        if (nationalID.length() != 12) {
            System.out.println("Invalid National ID length.");
            return;
        }

        if(number>=5){
            gender="Female";

            int year = Integer.parseInt(nationalID.substring(0, 4));
            int dayOfYear = Integer.parseInt(nationalID.substring(4, 7));
            dayOfYear=dayOfYear-500;

            LocalDate birthdate = LocalDate.ofYearDay(2012, dayOfYear);

            System.out.println("Birthdate: " +year +"-"+birthdate.getMonthValue() + "-" + birthdate.getDayOfMonth());

        } else  {
            gender="Male";
            int year = Integer.parseInt(nationalID.substring(0, 4));
            int dayOfYear = Integer.parseInt(nationalID.substring(4, 7));

            LocalDate birthdate = LocalDate.ofYearDay(2012, dayOfYear);

            System.out.println("Birthdate: " +year +"-"+birthdate.getMonthValue() + "-" + birthdate.getDayOfMonth());
            System.out.println("Gender : "+ gender);
        }

    }
}
