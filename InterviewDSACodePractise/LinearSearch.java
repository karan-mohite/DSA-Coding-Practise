public class LinearSearch
{
    public static int Search(int number[],int key)
    {
         for(int i=0;i<number.length;i++)
         {
            if(number[i]==key)
            {
                return i;
            }
         }
         return -1;
    }
   public static void main(String[] args) {
    
        int number[]={12,43,54,13,76};
        int key=54;

        int index=Search(number,key);

        if(index==-1)
        {
            System.out.println("Elements are not found..!!");
        }
        else
        {
            System.out.println("Elements are found at index:"+" "+index);
        }
   }
}
