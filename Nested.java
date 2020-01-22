class Nested
{
    public static void main(String[] args){
    Double n1 = -1.0,n2= 4.5,n3 = -5.3,largestnumber;
    if (n1>n2){
        if(n1>=n3)
            largestnumber=n1;
            else
                largestnumber=n3;}
            else {
        if (n2 > n3)
            largestnumber = n2;
        else
            largestnumber = n3;
    }
            System.out.print("Largest number is " + largestnumber);


}

}