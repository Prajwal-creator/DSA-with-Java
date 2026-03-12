public class twosum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int target=10;
        int low=0;
        int high=arr.length-1;
        int sum=0;
       while(low<high){
        sum=arr[low]+arr[high];
        if(sum==target){
            System.out.println("the target found"+sum+"at"+low+high);
            break;
        }else if(target>high){
            low++;
        }else if(target<low){
            high--;
        }
         
       }
    }
}
