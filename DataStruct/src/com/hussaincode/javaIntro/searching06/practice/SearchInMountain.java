package com.hussaincode.javaIntro.searching06.practice;

public class SearchInMountain {

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search(arr,target));
    }


    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticSearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //try to search in 2nd half
        else {
            return orderAgnosticSearch(arr,target,peak+1,arr.length-1);
        }
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start =0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //this maybe the ans  but look atb left
                //this is why end!=mid-1
                end=mid;
            } else {
                //you are in ascending part of array
                start=mid+1; //bcs we know that mid+1 element>mid element
            }
        }

        //in the end, start==end and pointing to the largest number because of the 2 checks above
        //start and end are trying to find maximum element in the above 2 checks
        // hence when they are just pointing to one element that is the max element
        return start;  //we can return end as well as both are equal
    }

    static int orderAgnosticSearch(int[] arr, int target,int start, int end){
        if (arr[start]<arr[end]){
            return binarySearch(arr,target,start,end);
        }else {
            return revrseBinarySearch(arr,target,start,end);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }else if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

    static int revrseBinarySearch(int[] arr, int target,int start, int end){

        while (start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }else if (target>arr[mid]){
                end=mid-1;
            }else if (target<arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }


}
