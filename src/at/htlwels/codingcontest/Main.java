package at.htlwels.codingcontest;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> Node = new HashMap<>();
        HashMap<String,Integer> Pool  = new HashMap<>();
        Scanner in = new Scanner(System.in).useDelimiter(" ");

        int totalamount = 0;
        int nodeamount;
        String nodeid;
        Integer nodevalue;
        int poolamount;
        String poolid;
        Integer poolvalue;
        nodeamount = in.nextInt();
        for(int i=0;i<nodeamount;i++){
            nodeid=in.next();
            nodevalue=in.nextInt();
            Node.put(nodeid,nodevalue);
        }
        poolamount = in.nextInt();
        for(int j=0;j<poolamount;j++){
            poolid=in.next();
            poolvalue=
            Node.get(in.next()) +
            Node.get(in.next()) +
            Node.get(in.next());
            Pool.put(poolid,poolvalue);
        }

        for(Map.Entry<String,Integer> entry : Node.entrySet()){
            totalamount = totalamount + entry.getValue();
        }

        System.out.println(totalamount);
        for(Map.Entry<String,Integer> entry1 : Pool.entrySet()){
            System.out.println(entry1.getKey() + " " + entry1.getValue() + " ");
        }




    }
}
