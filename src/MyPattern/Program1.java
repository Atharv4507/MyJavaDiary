package MyPattern;

public class Program1 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j = 1; j <=i; j++){
                if (count %2 != 0) {
                    System.out.print(count+"\t");
                }else{
                    System.out.print("#"+"\t");
                }
                count++;
            }
            // for(int k = i; k<n; k++){
            //     if(count % 2 != 0){
            //         System.out.print("*"+"\t");
            //     }
            //     else{
            //         System.out.print("#"+"\t");
            //     }
                
            // }
            System.out.println();
        }
    }
}
