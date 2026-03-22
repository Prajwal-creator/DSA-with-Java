public class two {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int low=0;
        int high=arr.length-1;
        int sum=0;
        int target=9;
            high=high-1;

        while(low<high){
            sum = arr[low] + arr[high];
            if(sum == target){
                System.out.println("the sum is"+sum+"and found at the index of the"+low+" "+high);
                break;
            }else if(arr[low]<sum){
                low++;
            }else if(arr[high]>sum){
                high--;
            }

        }
    }
    
}
