class Math
{
    static int a =10;
    static int b =20;

    static class Operation
    {
        static int d;
        int Calculate(){
              d = a+b;
            return d;
        }


    }
    public static void main(String[] args){

        Math.Operation lo = new Math.Operation();
        System.out.println(lo.Calculate());


    }
}
