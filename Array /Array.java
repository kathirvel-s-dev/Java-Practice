public class Array{
    public static void main(String[] args){
        System.out.println("Helooo");

        int[] arr={1,2,3,4,5};

       int[] arr2=new int[arr.length +1];

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }

        arr2[arr.length]=6;

        for (int num:arr2){
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println(arr2.length);
    }
}