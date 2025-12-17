class Demo{
    public static void main(String[]args){
        int num=12345;
        int rev=0;
        int mid=0;
        num=num/10;
        while(num>0){
           int rem=num%10;
           rev=rev*10+rem;
             num=num/10;
            }
            rev=rev/10;

            while(rev>0){
                int rem=rev%10;
                mid=mid*10+rem;
                rev=rev/10;
            }
            System.out.println(mid);
         }
    }