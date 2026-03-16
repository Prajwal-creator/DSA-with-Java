public class duplicate {
    public static void main(String[] args){
        int arr[]={0,1,2,3,5,0,0,10};
        int mov=0;
        int temp=0;
        for(int i = mov; i<arr.length; i++){
            if(arr[i]!=0){
                temp = arr[i];
                arr[i] = arr[mov];
                arr[mov] = temp;
                mov++;

            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
