package com.smart.smartparkingapp.parkingList.interfaces;

import com.smart.smartparkingapp.data.entity.Parking;

import java.util.ArrayList;

/**
 * Created by Bos on 2017-03-21.
 */
public interface ParkingListView {
    void showParkingList(ArrayList<Parking> parkingList);
}
