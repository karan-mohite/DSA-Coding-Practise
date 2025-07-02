public class SecondSmallest {
    public static void main(String[] args) {
               
        
        int a[]={6,22,33,8,11};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            } 
        }
        System.out.println("Second Smallest Elements:"+a[1]);

    }
}
