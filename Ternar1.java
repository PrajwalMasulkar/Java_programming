class Ternar1
{
    public static void main(String[] args){
        char c ='A';
        String Output=(c>='a' && c<='z') ||(c>='A'&&c<='Z')?c +" is an alphabet ":c + " is not a alphabet";
        System.out.println(Output);
    }


}
