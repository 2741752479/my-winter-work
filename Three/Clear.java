package Three;

import java.util.LinkedHashSet;


public class Clear {
    public static void main(String[] args) {
        String[] arr={"java","world","hello","java"};
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<String>();
        for(int x=0;x<arr.length;x++){
            linkedHashSet.add(arr[x]);
        }
        System.out.println(linkedHashSet);
    }
}
