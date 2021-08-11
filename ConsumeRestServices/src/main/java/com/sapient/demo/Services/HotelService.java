package com.sapient.demo.Services;

import com.sapient.demo.Controller.Hotel;

import java.util.List;

public interface HotelService {
    public List<Hotel> getHotels();

    public Hotel getHotel(long hotelId);

    public Hotel addHotel(Hotel hotel);

    public Hotel updateHotel(Hotel hotel);

    public boolean deleteHotel(long hotelId);
}
