public class Largest {
    public static void main(String[] args)
    {
        Integer a=2, b=4, c=6, largest, temp;
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);
    }
}
