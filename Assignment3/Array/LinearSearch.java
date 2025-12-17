class Demo{
    public static void main(String[]args){
        int[]arr={10,20,30,40};
        int search=30;
        boolean isFound=false;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==search){
                isFound=true;
                break;
            }
       } 
       if(isFound){
        System.out.println("Found");
       }else{
        System.out.println("Not Found");
        }
    }
}