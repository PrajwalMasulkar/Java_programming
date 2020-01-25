class Time1{
    int hr;
    int min;
    int sec;
    public Time1(int hor,int mins,int secs){
        int hours = hr;
        int minutes = min;
        int seconds = sec;
        hr = hor;
        min = mins;
        sec = secs;
        System.out.print("The Time is :"+hor+" hrs "+mins+" min "+secs+" sec ");
        System.out.println();

        System.out.print("The Time is :"+hours+" hrs "+minutes+" min "+seconds+" sec ");
        System.out.println();
    }
    void print(){
        System.out.print("The Time is :"+hr+" hrs "+min+" min "+sec+" sec ");
        System.out.println();

    }
    public static void main(String[] args){
        Time1 t= new Time1(10,20,30);
        t.print();
        System.out.println();
    }
}