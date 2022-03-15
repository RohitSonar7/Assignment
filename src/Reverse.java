public class Reverse {
    public static void main(String[] args)
    {
        Integer a=12345,reverse,r;
        while(a != 0)
        {
            r=a%10;
            reverse = reverse*10 + r;
            a=/10;
        }
        System.out.println("The reversed Number is :"  +reverse);
    }
}
