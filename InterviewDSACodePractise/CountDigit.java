public class CountDigit {
    public static void main(String[] args) 
    {
        int n=123456,rem,Count=0;

        while (n!=0)
        {
            rem=n%10;
            Count ++;   
            n=n/10;  
        }
        System.out.println(Count);
    }
}
