public class pal {
    public static void main(String[] args){
        int num[]={5};
        int a=0,b=num.length-1;
        boolean pal=false;
        while(a<b){
            if(num[a]!=num[b]){
                pal=true;
                break;

            }
            a++;
            b--;
        }
        if(pal){
            System.out.println("the number is not pal");
        }else{
            System.out.println("the number is palidrome");
        }
    }
}