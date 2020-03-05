class Large{
    public static void main(String[] args)
    {
        double[] numArray={23.4,-34.5,50.0,33.5,55.5,43.7,5.7,-66.5};
        double largest = numArray[0];
        for(int i=0;i<numArray.length;i++)
        {
            if(largest<numArray[i])
                largest=numArray[i];
        }
        System.out.print("largest Element is :"+largest);
    }
}