public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=8;
        int low=0;
        int high=arr.length-1;
        int sum=0;
        boolean isfound=false;
       while(low<high){
        sum=arr[low]+arr[high];
        if(sum==target){
            System.out.println("the target found"+sum+"at"+low+high);
            low++;
            high--;
            isfound=true;
        }else if(target>high){
            low++;
        }else if(target<low){
            high--;
        }else{
            System.out.println("the target not found value error");
        }
         
       }
       if(!isfound){
          System.out.println("not found.....");
       }
    }
}
