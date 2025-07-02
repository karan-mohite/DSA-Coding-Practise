import java.util.Arrays;

public class BinarySearch {

    public static int Search(int number[],int key)
    {
        int start=0,end=number.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }     
            if(number[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
       int number[]={12, 14, 43, 45, 56, 78, 90};
      
        int key=78;
        System.out.println("Elements is found at:"+Search(number,key));

    }
}
