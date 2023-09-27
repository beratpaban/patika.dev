public class Main {
    public static void main(String[] args) {
        int[] arr={34,2,15,40,76,4,12,89,0};
        for(int i =0;i<=arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int index:arr){
            System.out.println(index);
        }
    }
}