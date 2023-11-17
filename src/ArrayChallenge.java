import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {


    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);

        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(unsortedArray);

        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] arrayList = new int[len];

        for(int i = 0; i < arrayList.length; i++){

            arrayList[i] = random.nextInt(1000);

        }

//        System.out.println(Arrays.toString(arrayList));

        Arrays.sort(arrayList);

        return arrayList;
    }

    private static int[] sortIntegers(int[] array){

//        System.out.println(Arrays.toString(array));

        int[] sortedArray = Arrays.copyOf(array, array.length);


        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
//                    System.out.println("------>" + Arrays.toString(sortedArray));
                }
            }

//            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
