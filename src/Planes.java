/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author davor
 */
public class Planes {

    private HashMap<String, Integer> planes;

    public Planes() {
        this.planes = new HashMap<String, Integer>();
    }

    public void add(String planeID, int capacity) {
        this.planes.put(planeID, capacity);
    }

    public ArrayList<String> planeList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : planes.keySet()) {
            String plane = key + " (" + planes.get(key) + " ppl)";
            list.add(plane);
        }
        return list;
    }

    public String planeInfo(String planeID) {
        if (this.planes.containsKey(planeID)) {
            return planeID + " (" + this.planes.get(planeID) + " ppl)";
        }
        return null;
    }

}
