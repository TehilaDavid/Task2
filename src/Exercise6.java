public class Exercise6 {
    public static void main(String[] args) {
        int [] array1 = {3,9,1,10,2,10,5};
        int [] array2 = {1,3,5,10};

        //check intersection between two arrays
        int [] arrayIntersection = intersection(array1,array2);
        for (int i = 0; i < arrayIntersection.length; i++) {
            System.out.print(arrayIntersection[i] + ",");

        }
        //check if two arrays are foreign
        System.out.println(foreignArrays(array1,array2));

    }

    public static int[] intersection (int[] array1, int[] array2){
        int arrayLength = array1.length;
        int arrayNewLength = 0;
        int index = -1;
        int[] arrayIntersection = new int[arrayLength];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    index++;
                    arrayNewLength++;
                    arrayIntersection[index]= array1[i];
                    break;
                }

            }

        }
        int [] newArrayIntersection = recreateArray(arrayIntersection,arrayNewLength);

        newArrayIntersection = printArrayWithoutDuplications(newArrayIntersection);

        return newArrayIntersection;
    }


    public static boolean foreignArrays (int[] array1, int[] array2){
        boolean foreign = false;
        int [] array = intersection(array1,array2);
        if ( array.length == 0){
            foreign = true;

        }
        return foreign;
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
        int [] arrayNoDuplicate = recreateArray(array,arrayLength);

        return arrayNoDuplicate;
    }


    public static int [] recreateArray (int [] oldArray, int newLength){
        int [] newArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;

    }




}
