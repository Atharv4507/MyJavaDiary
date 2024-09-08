package MyArray;

import java.util.HashSet;
import java.util.Set;
// import java.util.SortedSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,3,4,5,6};
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println(s);   
    }
}
