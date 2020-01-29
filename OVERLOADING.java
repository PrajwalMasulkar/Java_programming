class OVERLOADING {
    void max(float a, float b) {
        System.out.println("MAx Method with float argument");
        if (a > b)
            System.out.println(a + "is greater");
        else
            System.out.println("b+"is greater);

    }

    void max(double a, double b) {
        System.out.println("Max Method with Double argument");
        if (a > b)
            System.out.println(a + "is greater");
        else
            System.out.println("b+"is greater);

    }

    void max(long a, long b) {
        System.out.println("MAx Method with float argument");
        if (a > b)
            System.out.println(a + "is greater");
        else
            System.out.println("b+"is greater);

    }

    public static void main(String args[]) {
        Overload O = new Overload();
        O.max(23L, 12L);
        O.max(2, 3);
        O.max(54f, 35f);
        O.max(43f, 55f);
    }
}