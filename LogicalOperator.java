class LogicalOperator
{
    public static void main(String[] args)
    {
        int n1=10,n2=15,n3=5;
        Boolean result;
        result = (n1>n2)||(n1>n3);
        System.out.println(result);
        result = (n2>n1)&&(n2>n3);
        System.out.print(result);
    }
}
