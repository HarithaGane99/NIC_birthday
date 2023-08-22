import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayFromNationalID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 12-digit National ID: ");
        String nationalID = scanner.next();



        System.out.print("Enter your Gender"+" Male or Female: ");
        String gender=scanner.next();
        scanner.close();

        if (nationalID.length() != 12) {
            System.out.println("Invalid National ID length.");
            return;
        }

        if(gender.equals("Female")){
            int year = Integer.parseInt(nationalID.substring(0, 4));
            int dayOfYear = Integer.parseInt(nationalID.substring(4, 7));
            dayOfYear=dayOfYear-500;

            LocalDate birthdate = LocalDate.ofYearDay(2012, dayOfYear);

            System.out.println("Birthdate: " +year +"-"+birthdate.getMonthValue() + "-" + birthdate.getDayOfMonth());

        } else if (gender.equals("Male")) {
            int year = Integer.parseInt(nationalID.substring(0, 4));
            int dayOfYear = Integer.parseInt(nationalID.substring(4, 7));

            LocalDate birthdate = LocalDate.ofYearDay(2012, dayOfYear);

            System.out.println("Birthdate: " +year +"-"+birthdate.getMonthValue() + "-" + birthdate.getDayOfMonth());
            System.out.println("Gender : "+ gender);
        }

    }
}
