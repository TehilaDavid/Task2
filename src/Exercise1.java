import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();


        System.out.println(stringContainsString(string1, string2));

    }


    public static boolean stringsAreEqual(int string1index, String string1, String string2) {
        boolean equals = true;

        for (int i = 1; i < string2.length(); i++) {
            string1index++;
            if (string1.charAt(string1index) != string2.charAt(i)) {
                equals = false;
                break;

            }
        }
        return equals;
    }


    public static boolean stringContainsString(String string1, String string2) {
        boolean isContain = false;
        int indexString1 ;
        for (indexString1 = 0; indexString1 < string1.length()-string2.length()+1; indexString1++) {
            if (string1.charAt(indexString1)== string2.charAt(0))
                isContain = stringsAreEqual(indexString1, string1, string2);
            else if (isContain){
                break;
            }
        }
        return isContain;
    }



}