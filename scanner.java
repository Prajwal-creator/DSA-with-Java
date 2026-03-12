public class scanner {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5};
        int fast=0;
        int slow=0;
        for(fast=1;fast<arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
          for(int i=0;i<=slow;i++){
            System.out.println(arr[i]+" ");
          }
    }
    
}
