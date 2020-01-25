class Time
{
    int hr;
    int min;
    int sec;
    public Time(){
        hr = 10;
        min = 20;
        sec = 45;

    }
    void print(){
        System.out.print("The Time is: "+hr+" hrs "+min+" min "+sec+" sec");

    }
    public static void main(String[] args){
        Time t=new Time();
        t.print();

    }

}