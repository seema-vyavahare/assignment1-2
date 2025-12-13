class Demo{
    public static void main(String[]args){
        int num=24;
        System.out.print("Perfect Divisior of"+num+ "are:");
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(+ i + " ");
            }
        }
    }
}