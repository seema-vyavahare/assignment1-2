class Demo{
    public static void main(String[]args){
        int a=10;
        int b=20;
        char op='-';
        if(op=='+'){
            System.out.println("Output="+(a+b));
        }else if(op=='-'){
            System.out.println("Output="+(a-b));
        }else if(op=='*'){
            System.out.println("Output="+(a*b));
        }else if(op=='/'){
            System.out.println("Output="+(a/b));
        }else{
             System.out.println("Operator not found");
        }
    }
}