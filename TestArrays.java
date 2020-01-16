public class TestArrays
{
    public static void main(String[] args){
        int[] a = {22, 44, 56,45, 33};
        System.out.print("output1: ");
        System.out.println("a: " + a);
        System.out.print("Output2: ");
        print(a);            int[] aa;
        aa = a;
        System.out.print("Output3: ");
        System.out.println("aa: " + aa);
        System.out.print("Output4: ");
        print(aa);
        a[3] = 88;
        System.out.print("Output5: ");
        print(a);
        System.out.print("output6: ");
        print(aa);
        aa[1] = 11;
        System.out.print("Output7: ");
        print(a);
        System.out.print("output8: ");
        print(aa);
    }
    public static void print(int[] a)
    {
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}