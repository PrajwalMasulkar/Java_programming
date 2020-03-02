class Employeee
{
    int empid;
    String name;
    static String company="SP";
    Employeee(int empid,String name)
    {
        this.empid=empid;
        this.name = name;

    }
    void display()
    {
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args)
    {
        Employeee c1 = new Employeee(101,"amit");
        c1.display();

        Employeee c2 = new Employeee(102,"deepak");
        c2.display();
    }

}