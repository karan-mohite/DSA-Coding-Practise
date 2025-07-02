public class ReverseArray {

    public static void reverseArray(int number[])
    {
        int first=0;
        int last=number.length-1;

        while (first<=last)
        {
            int temp;
            temp=number[first];
            number[first]=number[last];
            number[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={12,43,6,7,87,34};

        reverseArray(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
   
}
