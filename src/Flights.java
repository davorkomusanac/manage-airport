/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author davor
 */
public class Flights {

    private ArrayList<Flight> flights;

    public Flights() {
        this.flights = new ArrayList<Flight>();
    }

    public void addFlight(Flight newFlight) {
        this.flights.add(newFlight);
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
