package org.example;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Numbers {
    private int a;
    private int b;
    private int c;
    private int d;

    public Numbers(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void maxx(){
        int[] arr = {a, b, c, d};
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
