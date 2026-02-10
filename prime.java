public class prime {
    public static void main(String[] args) {
        System.out.println("prime number between 1 to 100");
        for(int i = 2; i<=100;i++){
            boolean isprime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime = false;
                    break;

                }
             
            }
               if(isprime){
                    System.out.print(i+" ");
                }
        }
    }
    
}
