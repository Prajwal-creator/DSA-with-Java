public class max {
    public static void main(String[] args){
       int arr[]={50,20,30,60,1};
       int val=0;
       for(int i=0;i<arr.length;i++){
          if(arr[i]>val){
            val=arr[i];
          }
            
       }
       System.out.println("the highest value is "+val);
    }
    
}
