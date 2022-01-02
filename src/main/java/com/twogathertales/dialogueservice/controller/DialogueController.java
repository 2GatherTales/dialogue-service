package com.twogathertales.dialogueservice.controller;

import com.twogathertales.dialogueservice.model.event.Event;
import com.twogathertales.dialogueservice.services.implementation.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
@RequestMapping("api/dialogue")
public class DialogueController {
    @Autowired
    private EventService eventService;

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    @RequestMapping(value = "health",
            method = RequestMethod.GET,
            produces =  {MimeTypeUtils.APPLICATION_JSON_VALUE},
            headers = "Accept=application/json")
    public ResponseEntity<String> health() {
        try {
            String response = "OK   " + now();
            return new ResponseEntity<String>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "event/{eventid}",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE},
            headers = "Accept=application/json")
    public ResponseEntity<Event> event(@PathVariable("eventid") Long id){
        try{
            return new ResponseEntity<Event>(eventService.find(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<Event>(HttpStatus.BAD_REQUEST);
        }
    }

}
