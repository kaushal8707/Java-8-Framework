package org.java8.framework.Stream.API;

public class ProductsOfTwoMinANdMax {
    public static void main(String[] args) {
        Integer minProducts=0;
        Integer maxProducts=0;
        int arr[] = {2, 4, 3, 7, 5, 8, 6, 1};
       sortAndFindMinAndMax(arr);
       minProducts=arr[0]*arr[1];
       maxProducts=arr[arr.length-1]*arr[arr.length-2];
        System.out.println("minProducts =  "+minProducts);
        System.out.println("maxProducts =  "+maxProducts);

    }

    private static void sortAndFindMinAndMax(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
