class Main
{
    public static void main(String[] args)
    {
        int x=8;
        int y=0;
        if(x>=0)
            if(y>=0)
                System.out.println("true");
            else System.out.println("false");
        else if(y<0)
            System.out.println("true");
            else System.out.println("false");
    }
}