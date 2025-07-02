public class LargestElementsInArray {

    public static int FindLargest(int no[],int large)
    {
        for(int i=0;i<no.length;i++)
        {
            if(no[i]>large)
            {
                large=no[i];
            }
        }
        return large;
    }
     public static void main(String[] args) {
        
        int number[]={12,43,65,88,42,90};

        int largest=Integer.MIN_VALUE;

         int max=FindLargest(number,largest);

         System.out.println("Largest Elements:"+max);
     }

}