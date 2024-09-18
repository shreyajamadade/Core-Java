package array;

public class OddElement{
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,1,1,2,3,3,3,5,5,6,6,6};
        for(int i=0;i<arr.length-1;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){ count++;
                }
            }
            if(arr[i]!=arr[i+1] || i==arr.length-2){
                if(count%2!=0)
                    System.out.println(arr[i]+" "+count);
            }
        }
    }
}