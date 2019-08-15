package com.example.restcontroller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {

    List<Message> messages = new ArrayList<>();


    @GetMapping("/welcome")
    public List<Message> welcome(){
        return messages;
    }

    //addmessage

    // adds message to the list
    @PostMapping("/addmessage")
    public ResponseEntity<Void> addMessage( @RequestBody Message message){
        messages.add(message);
        return ResponseEntity.accepted().build();
    }
}

class Message{
    String notes;

    public Message() {
    }

    public Message(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}