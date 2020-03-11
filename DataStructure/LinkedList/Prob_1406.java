package DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

/*
    Used listiterator to add, delete and move cursor one character

    * if use linkedlist takes 0(n) for each operations (add, delete, move)
      which exceeds time limits (2 sec) if operations are max 500,000

 */
public class Prob_1406 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int numOfOps = Integer.parseInt(br.readLine());
        String [] opsArr = new String[numOfOps];
        for(int i=0;i<numOfOps;i++){
            String ops = br.readLine();
            opsArr[i] = ops;
        }

        LinkedList<Character> list = new LinkedList<Character>();
        ListIterator iterator = list.listIterator(list.size());

        for(int i=0;i<input.length();i++){
            iterator.add(input.charAt(i));
        }

        for(String tmp : opsArr){

            if (tmp.length() > 1){

                String addChar = tmp.split(" ")[1];
                iterator.add(addChar.charAt(0));

            }
            else{

                if("L".equals(tmp)){
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                }

                else if("D".equals(tmp)){
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                }
                else {
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (char c : list) {

            sb.append(c);
        }
        bw.write(String.valueOf(sb));
        bw.close();

    }
}
