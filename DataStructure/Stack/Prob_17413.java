package DataStructure;

import java.io.*;
import java.util.Stack;

public class Prob_17413 {

    static void print(Stack stack, StringBuilder stringBuilder){
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
    }

    public static void main(String[] args) throws IOException {

        Stack<Character> stack = new Stack<>();

        boolean tag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()){

            if(c == '<'){
                print(stack, sb);
                tag = true;
                sb.append(c);
            }
            else if(c == '>'){
                tag=false;
                sb.append(c);
            }
            else if(tag){
                sb.append(c);
            }
            else{
                if(c == ' '){
                    print(stack, sb);
                    sb.append(c);
                }
                else{
                    stack.push(c);
                }
            }
        }
        print(stack, sb);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();


    }
}
