package com.sapient.demo.Services;

import com.sapient.demo.Controller.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    // Temporary Data
    List<Hotel> list;
    public HotelServiceImpl(){
        list = new ArrayList<>();
        list.add(new Hotel(121, "Hyatt", "This is the premium Quality Hotel in Delhi with all the facility"));
        list.add(new Hotel(122, "Crown Plaza", "This is the Best Hotel in Delhi"));
        list.add(new Hotel(123, "Oyo Hotels", "This is the Mid range Hotel in Delhi"));
        list.add(new Hotel(124, "Maanu Maharani", "This is the Best Hotel in Nanital"));
        list.add(new Hotel(125, "Trident", "This is the Best Hotel in Jaipur"));

    }

    @Override
    public List<Hotel> getHotels(){
        return list;
    }

    @Override
    public Hotel getHotel(long hotelId) {
        Hotel h = null;
        for(Hotel hotel: list){
            if(hotel.getId() == hotelId){
                h = hotel;
                break;
            }
        }
        return h;
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        list.add(hotel);
        return hotel;
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        Hotel h = null;
        for(Hotel hotel1: list){
            if(hotel1.getId() == hotel.getId()){
                hotel1 = hotel;
                h = hotel1;
                break;
            }
        }
        return h;
    }

    @Override
    public boolean deleteHotel(long hotelID) {
        Hotel h = null;
        for(Hotel hotel1: list){
            if(hotel1.getId() == hotelID){
                list.remove(hotelID);
                return true;
            }
        }
        return false;
    }
}
