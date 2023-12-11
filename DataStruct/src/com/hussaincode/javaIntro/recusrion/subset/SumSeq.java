package com.hussaincode.javaIntro.recusrion.subset;

import java.util.ArrayList;

public class SumSeq {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,1};
        int n = arr.length;
        int sum=2;
       // seq(0,0,list,arr,n,sum);
      //  seq2(0,0,list,arr,n,sum);
        System.out.println(countSeq(0,0,list,arr,n,sum));
    }
    static void seq(int index,int s, ArrayList<Integer> list, int[] arr, int n, int sum){
        if (index==n){
            if(s==sum) {
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
                return;
        }
        list.add(arr[index]);
        s+=arr[index];
        seq(index+1,s,list,arr,n,sum);
        s-=arr[index];
        list.remove(list.size()-1);
        seq(index+1,s,list,arr,n,sum);
    }

    static boolean seq2(int index,int s, ArrayList<Integer> list, int[] arr, int n, int sum){
        if (index==n){
            if(s==sum) {
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        s+=arr[index];
        if(seq2(index+1,s,list,arr,n,sum)){ return true;}
        s-=arr[index];
        list.remove(list.size()-1);
        if(seq2(index+1,s,list,arr,n,sum)){return true;}
        return false;
    }

    //if we want to remove arraylist, we can remove it as it's not required we just need return count not the list.
    static int countSeq(int index,int s, ArrayList<Integer> list, int[] arr, int n, int sum){
        if (index==n){
            if(s==sum) {
                return 1;
            }
            return 0;
        }
        list.add(arr[index]);
        s+=arr[index];
        int l = countSeq(index+1,s,list,arr,n,sum);
        s-=arr[index];
        list.remove(list.size()-1);
       int r = countSeq(index+1,s,list,arr,n,sum);
        return l+r;
    }
}
