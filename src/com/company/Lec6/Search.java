package com.company.Lec6;

public class Search {

    public static void main(String[] args) {

        int[] ar ={5,6,7,8,9};
//        System.out.println(linearsearch(ar,4));
        System.out.println(binarysearch(ar,7));
    }

    public static int linearsearch(int[] ar, int element){

        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static int binarysearch(int[] ar, int element){

        int low =0;
        int high = ar.length-1;

        while(low<=high){

//            int mid = (low+high)/2;
            int mid = low + (high-low)/2;

            if(ar[mid]==element){
                return mid;
            }

            else if(ar[mid]<element){

                low=mid+1;
            }

            else{
                high =mid-1;
            }
        }
        return -1;
    }
}
