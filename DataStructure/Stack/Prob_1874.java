package DataStructure;

import java.io.*;
import java.util.Stack;
/*
    problem_url: https://www.acmicpc.net/problem/1874
    1) push 1 ~ n integer to stack
    2) push in order until the given sequence
    3) if given sequence is smaller than the top stack then return "NO" which is impossible to match with the sequence
*/

public class Prob_1874 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int numOfSeq = Integer.parseInt(br.readLine());
         int[] arr = new int[numOfSeq];
         
        //insert sequence
        for(int i=0;i<numOfSeq;i++) {
             arr[i] = Integer.parseInt(br.readLine());
         }

        Stack<Integer> stack = new Stack<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        //# push to stack in order
        int order = 0;

        //arr: sequence
        for(int tmp : arr){
            
            if(tmp > order){
                while(tmp>order){
                    stack.push(++order);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else{
                if(stack.peek() != tmp){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");
            }
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
