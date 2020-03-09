package DataStructure;

import java.io.*;
import java.util.Stack;

public class Prob_1874 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int numOfSeq = Integer.parseInt(br.readLine());
         int[] arr = new int[numOfSeq];

        for(int i=0;i<numOfSeq;i++) {
             arr[i] = Integer.parseInt(br.readLine());
         }

        Stack<Integer> stack = new Stack<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         int order = 0;

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
