public class prime {
    public static void main(String[] args){
        boolean isalpha=false;
        int arr[]={0,1,2,3,4,5,6,7,8,9,10};
        for(int j=0;j<arr.length;j++){
            isalpha=false;
            if(arr[j]<2){
            System.out.println("the number less than 1 please enter the greater than 2 number");
        }else{
        for(int i=2; i*i<=arr[j]; i++){
            if(arr[j]%i==0){
               isalpha=true;
               break;
                    
            }
          } 
        }
        if(isalpha){
            System.out.println("the number is not prime"+arr[j]);
        }else{
            System.out.println("the number is prime"+arr[j]);
        }

        }

    }
}