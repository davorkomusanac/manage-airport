/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author davor
 */
public class Flight {

    private String planeInfo;
    private String departureCode;
    private String destinationCode;

    public Flight(String planeInfo, String departureCode, String destinationCode) {
        this.planeInfo = planeInfo;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    @Override
    public String toString() {
        return planeInfo + " (" + departureCode + "-" + destinationCode + ")";
    }

}
