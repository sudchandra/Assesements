
import java.util.*;
public class MergeSort {
        public static void conquer(int arr[], int si, int mid, int ei) {
            int merge[] = new int[ei - si + 1];
            int idx1 = si;
            int idx2 = mid + 1;
            int x = 0;
            while (idx1 <= mid && idx2 == ei) {
                if (arr[idx1] <= arr[idx2]) {
                    merge[x++] = arr[idx1++];
                } else {
                    merge[x++] = arr[idx2++];
                }
            }
            while (idx1 <= mid) {
                merge[x++] = arr[idx1++];
            }
            while (idx2 <= ei) {
                merge[x++] = arr[idx2++];
            }
            for (int i=0,j=si; i < merge.length; i++,j++) {
                arr[j] = merge[i];

            }
        }

        public static void divide(int arr[], int si, int ei) {
            int mid;
            if (si >= ei) {
                return;
            }
            mid = si + (ei - si) / 2;
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }

        public static void main(String args[]) {
            int arr[]=new int[100];
            int n =arr.length;
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the elements");
            int ele=sc.nextInt();
            for( int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }



            divide(arr, 0, arr.length - 1);
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
                System.out.println();
            }
        }
    }



