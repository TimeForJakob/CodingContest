package at.wels.htlwels.it.altendorfer.codingcontest;

import com.sun.applet2.AppletParameters;
import javafx.beans.property.IntegerProperty;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> nodes = new HashMap<>();
        HashMap<String, Integer> pools = new HashMap<>();
        String[] lineSplit;
        int nodeNumber = in.nextInt();
        int gesHash = 0;
        int poolCount;
        int poolSum = 0;

        for (int i = 0; i < nodeNumber; i++)
        {
            nodes.put(in.next(), in.nextInt());
        }

        for(int i : nodes.values())
        {
            gesHash += i;
        }

        System.out.println(gesHash);

        poolCount = in.nextInt();

        for(int i = 0; i <= poolCount; i++)
        {
            poolSum = 0;
            lineSplit = in.nextLine().split(" ");

            for(int j = 1; j < lineSplit.length; j++)
            {
                poolSum += nodes.get(lineSplit[j]);
                //System.out.println(poolSum);
            }

            pools.put(lineSplit[0], poolSum);
        }

        for(String name : pools.keySet())
        {
            System.out.println(name + " " + pools.get(name));
        }
    }
}
