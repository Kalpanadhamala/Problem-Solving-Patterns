class ReversedNumber{
    public static void main(String args[]){
        int rev = 0;
        int n = 7895;
        while(n>0){
        int digit = n%10;
        rev = rev*10+digit;
         n = n/10;
        }
        System.out.println("Reversed Num = "+rev);
    }

}