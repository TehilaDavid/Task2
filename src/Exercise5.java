
public class Exercise5 {
    public static void main(String[] args) {
        int[] array = {1,3,6,11,10,9,4,2,0};

        int result = printTheTop(array);
        System.out.println(result);

    }

    public static int printTheTop(int[] array) {
        int answer = 0;
        int topIndex = 0;
        for (int i = 0; i < array.length -1; i++) {
            topIndex = i;
            if (isBigger(array[i],array[i+1])) {
                break;
            }
        }
        for (int i = topIndex; i < array.length - 1; i++) {
            if (!isBigger(array[i], array[i+1])) {
                answer = -1;
                break;

            } else {
                answer = topIndex;
            }
        }
        return answer;

    }


    public static boolean isBigger(int number1, int followNumber) {
        boolean isBigger = false;
        if (number1 > followNumber) {
            isBigger = true;
        }
        return isBigger;
    }
}


