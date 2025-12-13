class Demo{
    public static void main(String[]args){
        int a=1;
        int b=5;
        for(int i=a;i<=b;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            System.out.println(i+"!-"+fact);
        }
    }
}