class Demo{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println("Addition of cubes="+(a*a*a+b*b*b));
        if(a*a>b*b){
        System.out.println("Subtraction of squares="+(a*a-b*b));
        }else{
        System.out.println("Subtraction of squares="+(b*b-a*a));
        }
    }
}