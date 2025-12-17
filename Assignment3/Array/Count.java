class Demo{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count1++;
            }else{
                count2++;
            }
        }
            System.out.println("Even="+count1);
            System.out.println("Odd="+count2);
    }
}