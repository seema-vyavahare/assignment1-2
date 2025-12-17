class Demo{
    public static void main(String[]args){
        int[]arr={5,2,8,1};
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int sort=arr[i];
                arr[i]=arr[j];
                arr[j]=sort;
            }
          }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }       
    }
}