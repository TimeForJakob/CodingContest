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
        Scanner in = new Scanner(System.in);


        int totalamount = 0;
        int nodeamount;
        String nodeid;
        Integer nodevalue;
        int poolamount;
        String poolid;
      int poolvalue=0;
        nodeamount = Integer.parseInt(in.nextLine());
        for(int i=0;i<nodeamount;i++){
            String line =in.nextLine();
            String[] line1 = line.split(" ");
            nodeid = line1[0];
            nodevalue = Integer.parseInt(line1[1]);
            Node.put(nodeid,nodevalue);
        }
        poolamount = Integer.parseInt(in.nextLine());
        for(int j=0;j<poolamount;j++){
            String line = in.nextLine();
            String[] line1 = line.split(" ");
            poolid = line1[0];
            for(int x=1;x<line1.length;x++)
            {
                poolvalue = poolvalue + Node.get(line1[x]);
            }
            Pool.put(poolid,poolvalue);
        }

        for(Map.Entry<String,Integer> entry : Node.entrySet()){
            totalamount = totalamount + entry.getValue();
        }

        System.out.print(totalamount+ " ");
        for(Map.Entry<String,Integer> entry1 : Pool.entrySet()){
            System.out.print(entry1.getKey() + " " + entry1.getValue() + " ");
        }




    }
}
