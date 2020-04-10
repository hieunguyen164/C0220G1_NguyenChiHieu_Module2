package b3_lopvadoituong.baitap;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = numArr();
        System.out.println(stopWatch.start());
        selectionSort(array);
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }

    static int randomNum(){
        Random random = new Random();
        int num = random.nextInt(100000);
        return num;
    }

    static int[] numArr(){
        int [] arr = new int[100000];
        for(int i =0; i<arr.length; i++){
            arr[i] = randomNum();
        }
        return arr;
    }

    static int [] selectionSort(int[]arr){
        for(int i = 0; i < arr.length-1 ; i++){
            int minValue = i;
            for(int j = i+1; j < arr.length ; j++ ){
                if(arr[j] < arr[minValue]){
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
