public class prime {
    public static void main(String[] args){
        int num=8;
        boolean isprime=true;
        if(num<2){
            System.out.println("the number less than 1 please enter the greater than 2 number");
            return;
        }else{
            for(int i=2; i*i<=num; i++){
            if(num%i==0){
                isprime=false; 
                break;   
            }
          } 
        }
            
        if(isprime){
            System.out.println("the number is prime"+num);
        }else{
            System.out.println("the number is not prime"+num);
        }

    }
}