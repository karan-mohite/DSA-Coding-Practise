public class elementsDuplicate {
   public static void main(String[] args) 
   {
  
        int arr[]={1,2,3,4,5,6,7,2};

        boolean flag=false;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found Duplicate Element:"+arr[i]);
                     flag=true;
                }
            }
       }
        if(flag==false)
        {
            System.out.print("Duplicate Element not found..!!!");
        }

    }
}
 
