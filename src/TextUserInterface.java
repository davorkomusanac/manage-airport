/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author davor
 */
public class TextUserInterface {

    private Scanner command;
    private Planes planes;
    private Flights flights;
    private Flight flight;

    public TextUserInterface(Scanner command, Planes plane, Flights flights) {
        this.command = command;
        this.planes = plane;
        this.flights = flights;
    }

    public void start() {
        this.AirportPanel();
        this.FlightService();
    }

    private void AirportPanel() {
        System.out.println("Airport panel\n" + "--------------------");

        while (true) {
            System.out.print("Choose operation:\n" + "[1] Add airplane\n" + "[2] Add flight\n" + "[x] Exit\n" + "> ");
            String newCommand = this.command.nextLine();
            if (newCommand.equals("x")) {
                System.out.println("");
                break;
            } else if (newCommand.equals("1")) {
                this.addPlane();
            } else if (newCommand.equals("2")) {
                this.addFlight();
            }
        }
    }

    private void FlightService() {
        System.out.println("Flight service\n" + "------------");

        while (true) {
            System.out.print("Choose operation:\n" + "[1] Print planes\n" + "[2] Print flights\n" + "[3] Print plane info\n" + "[x] Quit\n" + "> ");
            String newCommand = this.command.nextLine();
            if (newCommand.equals("x")) {
                break;
            } else if (newCommand.equals("1")) {
                this.printPlanes();
            } else if (newCommand.equals("2")) {
                this.printFlights();
            } else if (newCommand.equals("3")) {
                this.printPlaneInfo();
            }
        }
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String planeID = this.command.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(this.command.nextLine());
        this.planes.add(planeID, planeCapacity);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = this.command.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = this.command.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = this.command.nextLine();
        this.flight = new Flight(this.planes.planeInfo(planeID), departureCode, destinationCode);
        this.flights.addFlight(flight);
    }

    private void printPlanes() {
        for (String plane : this.planes.planeList()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        this.flights.printFlights();
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = this.command.nextLine();
        System.out.print(this.planes.planeInfo(planeID));
        System.out.println("");
    }
}
