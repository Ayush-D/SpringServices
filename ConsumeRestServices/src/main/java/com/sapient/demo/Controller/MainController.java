package com.sapient.demo.Controller;

import com.sapient.demo.Greeting;
import com.sapient.demo.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {
    
    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        return this.hotelService.getHotels();
    }

    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotel(@PathVariable String hotelId){
        return this.hotelService.getHotel(Long.parseLong(hotelId));
    }

    @PostMapping("/hotels")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return this.hotelService.addHotel(hotel);
    }

    @PutMapping("/hotels")
    public Hotel updateHotel(@RequestBody Hotel hotel){
        return this.hotelService.updateHotel(hotel);
    }
    @DeleteMapping("/hotels/{hotelID}")
    public boolean delete (@PathVariable String hotelID){
        return this.hotelService.deleteHotel(Long.parseLong(hotelID));
    }
}
