package Striver.Array;

public class ArrayisSorted {
    public static void main(String[] args) {
        boolean flag=false;
        int a[] = {1,2,3,4,5};
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]<a[i+1]){
                flag = true;
            }
            else {
                flag=false;
                break;
            }

        }
    System.out.println((flag==true)?"sorted":"unsorted");
    }
}
