package CoreJava;

import javax.script.ScriptContext;
import java.util.Scanner;

public class MazePathRecursion {
    static int maze(int s, int t, int a, int b){
        if(s==a && t==b) return 1;
        if(s>a || t>b ) return 0;
        return maze(s+1,t,a,b) + maze(s,t+1,a,b);
    }
    static int maze2(int row, int col){
        if(1==row || 1==col) return 1;
        return maze2(row-1,col) + maze2(row,col-1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter location of the Maze End in 2D: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        System.out.println(maze(1,1,a,b));
        System.out.println(maze2(a,b));
    }
}
