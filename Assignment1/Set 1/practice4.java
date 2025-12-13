class Demo{
    public static void main(String[]args){
        int num=10;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        double avg=sum/10.0;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }
}