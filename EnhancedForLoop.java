class EnhancedForLoop{
    public static void main(String[] args){
        int sum=0;
        int[] numbers = {5,6,7,8,5,4,1,4,2};
        for(int number: numbers){
         sum += number;
        }
         System.out.println(sum);
    }

}