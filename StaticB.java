class StaticB{
    static int a;
    static int b;
    static{a=10;b=30;}
    public static void main(String[] args){
        System.out.println("The Value of a: "+a);
        System.out.println("The Value of b: "+b);
    }
}