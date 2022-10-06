
public class Exercise4 {
    public static void main(String[] args) {

       int [] sample = {1,4,7,1,8,9,2,1,3,8,0};

        int [] newArray = printArrayWithoutDuplications(sample);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ",");

        }

    }

    public static int[] printArrayWithoutDuplications (int [] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i +1 ; j < arrayLength; j++) {
                if (array[i] == array[j]){
                    array[j] = array[arrayLength -1];
                    arrayLength--;
                }
            }
        }
        int [] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }






}
