package Three;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class String_number {
    public static void main(String[] args) {
        String[]s={"hello","world","java","mysql","hello","java"};
        HashMap<String,Integer> hm= new HashMap<String,Integer>();
            for(String s1:s){
                if(!hm.containsKey(s1)){
                    hm.put(s1,1);
                }
                    else{
                        hm.put(s1,hm.get(s1)+1);
                    }
            }
        Set<String> keyset = hm.keySet();
            for(String key:keyset){
                int number=hm.get(key);
                System.out.println(key+":"+number);
            }


    }

}

