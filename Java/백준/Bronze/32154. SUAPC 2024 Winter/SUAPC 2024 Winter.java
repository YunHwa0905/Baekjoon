import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String[][] teams = {
            {"A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "I", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "I", "L", "M"},
            {"A", "B", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "C", "E", "F", "G", "H", "L", "M"},
            {"A", "B", "C", "F", "G", "H", "L", "M"}
        };
        
        String[] team = teams[N-1];
        System.out.println(team.length);
        
        for (int i = 0; i < team.length; i++) {
            System.out.print(team[i]);
            if (i < team.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}