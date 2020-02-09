class Bank{
    int PA,time;
    static int no=0,roi=10;

    Bank(int P,int t){
        no++;
        PA=P;time=t;
        if(no>20)
            Change2();
        else if(no>10)
            Change1();
        display();


    }

    static void Change1(){
        roi=20;

    }
    static void Change2(){
        roi = 30;
    }
    void display()
        {
        System.out.println("SI ="+(PA*roi*time)/100);
        }
    public static void main(String[] args){
        Bank bl = new Bank(500,2);
        Bank b30 = new Bank(6000,7);
    }
}