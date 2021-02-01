package com.xlx.sort.merge;


/**
 * 使用递归获取数组中最大的数
 * 求最大值问题：
 * 使用递归求最大值，就是分为求左边最大值和右边最大值，然后求整体的最大值
 * 如何求左边的最大值，将左边部分分为两部分，继而求左部分的最大值和右部分的最大值，
 * 使用递归最后求出整体左部分的最大值和整体有部分最大值，最后返回最大值
 * @author xlx
 * @Date: 2021/2/1
 * @Description:com.xlx.sort
 * @version:1.0
 */
public class GetMax {
    public static void main(String[] args) {
        int[] array = {3,2,5,6,7,4};
//        int max1 = getMax(array, 0, array.length - 1);
//        int max1 = process(array, 0, array.length - 1);
        int max1 = getMaxNumber(array, 0, array.length - 1);
        System.out.println(max1);
    }

    public static int process(int[] arr, int L, int R) {
        System.out.println("L:"+L+" R:"+R);
        if (L == R) {
            return arr[L];
        }
        int mid = L + ((R - L) >> 1);
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);
    }

    public static int getMaxNumber(int[] array , int left, int right){
        if (left==right){
            return array[left];
        }

        int mid = left+((right-left)>>1);
        int leftMax = getMaxNumber(array,left,mid);
        int rightMax = getMaxNumber(array,mid+1,right);
        return Math.max(leftMax,rightMax);
    }
}
