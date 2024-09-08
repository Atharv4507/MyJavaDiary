package MyArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MyArray {
    public static int[] MyNumArray(){
        return new int[] {16,33,51,27,73,1,9,8,4,27};
    }public static int[] MyNumArray2(){
        return new int[] {45,33,521,207,73,10,92,8,41};
    }
    public static void main(String[] args) {
        
        /*01*/  SortArray(MyNumArray());
        /*02*/  SumOfArray(MyNumArray());
        /*03*/  GridOfArray(MyNumArray());
        /*04*/  AvgOfArray(MyNumArray());
        /*05*/  IndexOfArryElemnet(MyNumArray(),51);
        /*06*/  sumOfdigitOfElementInArray(MyNumArray());
        /*07*/  ShiftFirstElementToLast(MyNumArray());
        /*08*/  SwapFirstAndLastElement(MyNumArray());
        /*09*/  ReverseArrayWithoutThiredVar(MyNumArray());
        /*10*/  SearchItemIndexInArray(MyNumArray(),51);
        /*11*/  RemoveElementbyIndex(MyNumArray(),4);
        /*12*/  AddSumOfElementAtEndOfElement(MyNumArray());
        /*13*/  AddSumOfElementAtFirstOfElement(MyNumArray());
        /*14*/  CopyArrayByIterrating(MyNumArray());
        /*15*/  insertElementAtPerticularIndex(MyNumArray(),6,45);
        /*16*/  FindCommonElementinTwoArrays(MyNumArray(),MyNumArray2());
        /*17*/  FindCommonElementinArray(MyNumArray());
        /*18*/  JoinTwoArrays(MyNumArray(), MyNumArray2());
        
    }
    private static void JoinTwoArrays(int []arr, int []arr2){
        int n = arr.length + arr2.length;
        int[] arr3 = new int[n];
        for(int i=0;i<n;i++){
            if(i<arr.length)
                arr3[i] = arr[i];
            else
                arr3[i] = arr2[i-arr2.length-1];
        }
        System.out.println("Joined Arrays is: "+Arrays.toString(arr3));

    }
    private static void FindCommonElementinArray(int[] arr) {
        System.out.print("You'r Array: "+Arrays.toString(arr));
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    myset.add(arr[i]);
                }
            }
        }
        System.out.println(" Common element in Array is: "+myset);
    }
    private static void FindCommonElementinTwoArrays(int[] arr, int[] arr2) {
        System.out.print("You'r 1st Array: "+Arrays.toString(arr)+" you'r 2nd Array: "+Arrays.toString(arr2));
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr2[i]) {
                    myset.add(arr[i]);
                }
            }
        }
        System.out.println("\nCommon element in both Arrays are: "+myset);
        
    }
    private static void insertElementAtPerticularIndex(int[] arr, int index, int number){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" you'r new Array: ");
        for(int i=arr.length-1; i>index; i--){
                arr[i]=arr[i-1];
            
        }
        arr[index] = number;
        System.out.println(Arrays.toString(arr));
    }
    private static void CopyArrayByIterrating(int [] arr){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" you'r new Array: ");
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    private static void AddSumOfElementAtFirstOfElement(int[] arr){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" you'r new Array: ");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int num = arr[i];
            while (num !=0 ) {
                sum+=num%10;
                num/=10;
            }
            int len = Integer.toString(arr[i]).length();
            arr[i] = sum * (int)Math.pow(10,len) + arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }
    private static void AddSumOfElementAtEndOfElement(int[] arr){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" you'r new Array: ");
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            int num = arr[i];
            while(num != 0){
                sum+=num%10;
                num/=10;
            }
            int len =  Integer.toString(sum).length();
            arr[i] = arr[i]*(int)Math.pow(10,len) + sum;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void RemoveElementbyIndex(int[] arr, int index){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+"  "+index+" index is removed new Array: ");
        for(int i =index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));

    }
    private static void SearchItemIndexInArray(int[] arr, int num){
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+"  "+num+" is present at index: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i);
            }
        }

    }
    private static void ReverseArrayWithoutThiredVar(int[] arr) {
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" Your new Array: ");
        for(int i = 0; i<arr.length/2; i++){
            arr[i] += arr[arr.length -i-1];
            arr[arr.length-i-1] = arr[i] - arr[arr.length -1 -i];
            arr[i] -= arr[arr.length -1 -i];
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void SwapFirstAndLastElement(int[] arr) {
        /*Without using thired variable */
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" Your new Array: ");
        arr[0] += arr[arr.length-1];
        arr[arr.length-1] = arr[0] - arr[arr.length-1];
        arr[0] = arr[0] - arr[arr.length-1];
        System.out.println(Arrays.toString(arr));
    }

    private static void ShiftFirstElementToLast(int[] arr) {
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" Your new Array: ");
        int temp = 0;
        temp = arr[0];
        for(int i =1;i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void sumOfdigitOfElementInArray(int[] arr) {
        System.out.print("You'r Original Array: "+Arrays.toString(arr)+" Your new Array: ");
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            int n = arr[i];
            while(n != 0){
                sum+=n%10;
                n/=10;
            }
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));

        // Here we use String Which take more Space int take 4 byte & String take * byte, so
        // Below one is best.
        /*
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            int n = arr[i];
            while(n != 0){
                sum+=n%10;
                n/=10;
            }
            arr[i] = sum;
        }
         */
    }

    private static void IndexOfArryElemnet(int[] arr, int num) {
        // int j = 0;
        for(int i=0;i<arr.length;i++)
            if (num==arr[i])
                System.out.println(num+" is present at index: "+i);
            // else{
            //     while(j<1){    
            //         System.out.println(num+" is not present in Array: "+Arrays.toString(arr));
            //         j++;
            //     }
            // }

    }   
    static void AvgOfArray(int[] arr) {
        int sum = 0;
        for(int i: arr)
            sum+=i;
        int avg = sum/arr.length;
        System.out.println(avg);
    }

    static void GridOfArray(int[] arr) {
        int[][] a = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.printf("%2d ",a[i][j]);
            System.out.println();
        }
    }
    static void SumOfArray(int[] arr) {
        int sum = 0;
        for(int i: arr)
            sum+=i;
        System.out.println(sum);
    }
    
    static void SortArray(int[] n){
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}
