import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();


        List<String> word = new ArrayList();
        String s, cur="";

        while ((s=in.readLine())!=null){
            for (int i=0;i<s.length();i++){
                if(Character.isLetter(s.charAt(i))) cur+=s.charAt(i);
                else {
                    cur = cur.toLowerCase();
                    if(!cur.equals("")&& !word.contains(cur))
                        word.add(cur);
                    cur="";
                }
            }
            cur=cur.toLowerCase();
            if(!cur.equals("")&&!word.contains(cur))
                word.add(cur);
            cur="";
        }

        Collections.sort(word);

        for(String str:word)
            out.append(str).append("\n");

        System.out.print(out);

    }
}
