package MyPattern;

public class Program2 {
    static int n=5;
    public static void main(String[] args) {
        p1();
        p2();
        p3();
    }
    /*
        1
        # 2
        # # 3
        # # # 4
        # # # # 5
    */
    private static void p1(){
        for(int i = 1; i<=n; i++){
            for(int j=i; j>1;j--){
                System.out.print("# ");
            }
            System.out.println(i);
        }
    }
    /* 
        _   _   _   _   1
        _   _   _   *   3
        _   _   *   5   *
        _   7   *   9   *
        11  *   13  *   15
    */
    private static void p2(){
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=i;j<n;j++){
                System.out.print("_    ");
            }
            for(int k=i;k>=1;k--){
                if(k%2==0){
                    System.out.print("*    ");
                }
                else{
                    System.out.print(count+"    ");
                }
                count++;
            }
            System.out.println();
        }
    }
    /*
        _   _   _   _   *   _   _   _   _ 
        _   _   _   2   2   2   _   _   _
        _   _   *   *   *   *   *   _   _
        _   4   4   4   4   4   4   4   _
       *    *   *   *   *   *   *   *   *
    
    */
    private static void p3(){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("_    ");
            }
            for(int k=1; k<=(2*(i-1))+1; k++){
                if(i%2==0){
                    System.out.print(i+"    ");
                }else{
                    System.out.print("*    ");
                }
            }
            for(int l=i;l<n;l++){
                System.out.print("_    ");
            }
            System.out.println();
        }
    }
}

