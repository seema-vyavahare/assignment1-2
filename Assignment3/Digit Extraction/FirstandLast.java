class Demo{
    public static void main(String[]args){
        int num=5678;
        int rem=0;
        int lastdigit=num%10;
        while(num>0){
             rem=num%10;
             num=num/10;
            }
            System.out.print("First:"+rem);
            System.out.print("Last:"+lastdigit);
         }
    }