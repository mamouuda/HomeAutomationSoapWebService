/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.serviceImpl;

import de.cynapsys.homeautomation.entity.Device;
import de.cynapsys.homeautomation.service.DevicesService;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
/**
 *
 * @author mouadh
 */
@WebService(endpointInterface = "de.cynapsys.homeautomation.service.DevicesService")
public class DeviceServiceImpl implements DevicesService {


    @Override
    public ArrayList<Device> getAllDevices() {
        ArrayList<Device> listdevices = new ArrayList<>();

        Device d1 = new Device(1001L, "Device1", "Device1 Description", 00);
        Device d2 = new Device(1002L, "Device2", "Device2 Description", 50);
        Device d3 = new Device(1003L, "Device3", "Device3 Description", 80);

        listdevices.add(d3);
        listdevices.add(d2);
        listdevices.add(d1);
        System.out.println(listdevices);
        return listdevices;
    }

    
    @Override
    public boolean setValue( Long deviceID,  int value) {
        try {
            Device device = getDeviceByID(deviceID);
            device.setCurrentValue(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public int getValue( Long deviceID) {
        Device device = getDeviceByID(deviceID);
        System.out.println(device.getCurrentValue());
        return device.getCurrentValue();
    }


    @Override
    public Device getDeviceByID( Long deviceID) {
        Device device = new Device(deviceID, "devideByID", "deviceByIDDescription", 80);
        return device;
    }

}
