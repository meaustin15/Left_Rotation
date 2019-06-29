import java.io.BufferedWriter;
import java.util.*;
import java.io.*;

public class Left_Rotation {

    public static void main(String[] args) throws IOException {
        int size = 5;
        int[] a = new int[size];
        int d = 4;

        for(int x = 0; x < a.length; x++){
           a[x] = x+1;
           System.out.print(a[x] + ", ");

        }



            System.out.println("");
        int[] result = rotLeft(a, d);
        for(int i =0; i < result.length; i++){
           System.out.print(result[i] + ", ");
        }
    }

    static int[] rotLeft(int [] arr, int d){
        int[] rot = new int[arr.length];

//        for(int i =0; i < arr.length; i++){
//            rot[i] = arr[i];
//        }

//        int index = 0;
//        for(int y = 0; y < rot.length; y++){
//          rot[y] = rot[(rot.length-d+y)%rot.length];
//        }

        System.arraycopy(arr, d, rot, 0, arr.length - d);
        System.arraycopy(arr, 0, rot, arr.length - d, d);

        return rot;
    }
}
