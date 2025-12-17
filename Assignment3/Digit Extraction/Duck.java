class Demo{
    public static void main(String[]args){
        int num=123;
        int rem=0;
        boolean isDuck=false;
        while(num>0){
             rem=num%10;
            if(rem==0){
               isDuck=true;
               break;
            }
            num=num/10;
             }
               if(isDuck){
                 System.out.println(" Duck Number");
               } else{
                 System.out.println("Not Duck Number");
               }
        }
    }
