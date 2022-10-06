import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a phone number: ");
        String userPhoneNumber = scanner.nextLine();
        mobilePhoneValidation(userPhoneNumber);


    }
    public static String mobilePhoneValidation (String userPhoneNumber){
        String message = " ";

        if (numberingPlan2(userPhoneNumber)) {
            System.out.println(userPhoneNumber);

        } else if (numberingPlan1(userPhoneNumber)){
            printTheRest(2,3,10,userPhoneNumber);

        }else if (numberingPlan3(userPhoneNumber)) {
            printTheRest(4,5,12,userPhoneNumber);

        }else{
                return message;
            }
        return message;
    }

    public static boolean numberingPlan1 (String phoneNumber) {
        boolean valid = false;
        if (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '5' && phoneNumber.length() == 10 &&phoneNumber.charAt(3)!= '-'
                && checkTheRestNumbers(phoneNumber,2)){

            valid = true;
        }
         return valid;
    }

    public static boolean numberingPlan2 (String phoneNumber) {
        boolean valid = false;
        if  (phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '5' && phoneNumber.charAt(3) == '-'
                && phoneNumber.length() == 11 && checkTheRestNumbers(phoneNumber,4)){
            valid = true;
        }
        return valid;
    }

    public static boolean numberingPlan3 (String phoneNumber) {
        boolean valid = false;
        if (phoneNumber.charAt(0) == '9' && phoneNumber.charAt(1) == '7' && phoneNumber.charAt(2) == '2' &&
                phoneNumber.charAt(3) == '5' && phoneNumber.length() == 12 && checkTheRestNumbers(phoneNumber,4)){
            valid = true;
        }
            return valid;
    }

    public static void printTheRest (int index, int start, int end, String userPhoneNumber){
        System.out.print("05"+userPhoneNumber.charAt(index) +"-") ;
        for (int i = start; i <end ; i++) {
            System.out.print(userPhoneNumber.charAt(i));
        }

    }
    public static boolean checkTheRestNumbers (String userPhoneNumber, int initialStart){
        boolean isNumbers = false;
        for (int i = initialStart ; i < userPhoneNumber.length(); i++){
            for (int j = 0; j <= 9 ; j++) {
                if (userPhoneNumber.charAt(i) == j){
                    isNumbers = true;
                    break;
                }
            }
        }
        return isNumbers;
    }

}

