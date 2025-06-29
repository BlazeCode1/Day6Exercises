import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Day 5 Exercises ----");
        int choice;
        do {
            System.out.println("1- Exercise 1");
            System.out.println("2- Exercise 2");
            System.out.println("3- Exercise 3");
            System.out.println("4- Exercise 4");
            System.out.println("5- Exercise 5");
            System.out.println("6- Exercise 6");

            System.out.println("0- Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    ExerciseOne();
                    break;
                case 2:
                    ExerciseTwo();
                    break;
                case 3:
                    ExerciseThree();
                    break;
                case 4:
                    ExerciseFour();
                    break;
                case 5:
                    ExerciseFive();
                    break;
                case 6:
                    ExerciseSix();

            }
        }while (choice != 0);

    }


    public static void ExerciseOne(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(-20);
        nums.add(0);
        nums.add(30);
        nums.add(40);
        nums.add(60);
        nums.add(10);

        if(nums.getFirst().equals(nums.getLast())){
            System.out.println("First and last are equal");
        }else {
            System.out.println("First and last dont equal");
        }

    }
    public static void ExerciseTwo(){
    double[] numbers = {1,4,17,7,25,3,100};
    double sum = 0;
    double average;

        for (double number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;
        System.out.printf("average is : %.2f \n",Math.floor(average));
        for(double number : numbers){
            if(number > average){
                System.out.println("greater than average: "+ (int)number);
            }
        }

    }
    public static void ExerciseThree(){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    if(numbers.getFirst() > numbers.getLast()){
        System.out.println("the greater number is " + numbers.getFirst());
    }else {
        System.out.println("the greater number is "+ numbers.getLast());
    }
    }
    public static void ExerciseFour(){
    int[] arr = {20,30,40,50,60,70};
    System.out.println(Arrays.toString(arr));

    int temp = arr[arr.length -1]; // using temp to swap
    arr[arr.length -1] = arr[0]; // temped element has first element
    arr[0] = temp; // swapped element(last element) is now first
        System.out.println(Arrays.toString(arr));
    }
    public static void ExerciseFive(){
    int[] array = {1,2,3,4,5,6,7,8,3,2,1,6,3,5,32,3,0};
    ArrayList<Integer> evenArr = new ArrayList<>();
    ArrayList<Integer> oddArr = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                evenArr.add(i);
            } else {
                oddArr.add(i);
            }

        }
        oddArr.addAll(evenArr);
        System.out.println(oddArr);
    }
    public static void ExerciseSix(){
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.toString(arr2) + "\n" +Arrays.toString(arr2));
        System.out.println("Arrays equality is : "+Arrays.equals(arr1,arr2));
    }
}
