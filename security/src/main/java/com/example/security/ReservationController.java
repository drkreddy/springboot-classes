package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ReservationController {

    static List<Trip> trips =new ArrayList<Trip>();

    @GetMapping("/trips")
    public List<Trip> showTrips(){
        return trips;

    }
    @PostMapping("/addtrip")
    public boolean addTrips(@RequestBody  Trip trip){
       return trips.add(trip);
    }
    @GetMapping("/balance")
    public Integer bal(){
        return 100000;
    }
}



class Trip{
    String from;
    String dest;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Trip(String from, String dest) {
        this.from = from;
        this.dest = dest;
    }

    public Trip() {
    }

}