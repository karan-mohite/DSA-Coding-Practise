public class NonDuplicateElement {
    public static void main(String[] args) 
    {
        

     int arr[]={1,2,3,5,1,4};

     for(int i=0;i<arr.length;i++)
     {
        int x=arr[i];
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Non Duplicate Elements is:"+arr[i]+" ");
        }
    }
    }
}
