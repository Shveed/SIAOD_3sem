package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Route{
    public int number;
    public String last_station;
    public String time_of_departure;
    public int price;

    Route(int Number, String Last_station, String Time_of_departure,
          int Price){
        this.number = Number;
        this.last_station = Last_station;
        this.time_of_departure = Time_of_departure;
        this.price = Price;
    }



    public void add_to_file(File file1){
        try (FileWriter writer = new FileWriter(file1, true)) {
            writer.write(number + "\r\n");
            writer.write(last_station + "\r\n");
            writer.write(time_of_departure + "\r\n");
            writer.write(price + "\r\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void show(){
        System.out.println("Number: " + this.number);
        System.out.println("Last Station: " + this.last_station);
        System.out.println("Time of Departure: " + this.time_of_departure);
        System.out.println("Price: " + this.price);
    }

    public int getNumber() {
        return number;
    }

    public void clear(){
        this.number = 0;
        this.last_station = null;
        this.time_of_departure = null;
        this.price = 0;
    }
}
