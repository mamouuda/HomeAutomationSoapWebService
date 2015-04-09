/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.serviceImpl;

import de.cynapsys.homeautomation.entity.Device;
import de.cynapsys.homeautomation.entity.Room;
import de.cynapsys.homeautomation.service.DevicesService;
import java.util.ArrayList;
import java.util.Objects;
import javax.jws.WebService;
/**
 *
 * @author mouadh
 */
@WebService(endpointInterface = "de.cynapsys.homeautomation.service.DevicesService")
public class DeviceServiceImpl implements DevicesService {

        ArrayList<Device> listdevices = new ArrayList<>();

        Device d1 = new Device(1001L, "Device1", "Device1 Description", 00);
        Device d2 = new Device(1002L, "Device2", "Device2 Description", 50);
        Device d3 = new Device(1003L, "Device3", "Device3 Description", 80);
        
        
        ArrayList <Room> listRoom = new ArrayList<>();
        
        Room r1 = new Room(10002L, "cuisine", "cuisine description");
        Room r2 = new Room(10002L, "salon", "salon description");
        Room r3 = new Room(10002L, "salle à manger", "salle à manger description");
        
        
    @Override
    public ArrayList<Device> getAllDevices() {
        
        
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
        int device = deviceListPosition(deviceID);
        return listdevices.get(device);
    }

    @Override
    public Long addDevice(Device device) {
        device.setId(555L);
        listdevices.add(device);
        return device.getId();
    }

    @Override
    public boolean deleteDevice(Long deviceID) {
        Device d = getDeviceByID(deviceID);
        return listdevices.remove(d);
    }

    @Override
    public boolean updateDevice(Device device) {
        int i= deviceListPosition(device.getId());
        try{
            listdevices.set(i, device);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean attachDeviceToRoom(Long deviceID, Long roomID) {
    try{
        
    }
    catch(Exception e){
        
    }
    }

    @Override
    public boolean detachDeviceFromRoom(Long deviceID, Long roomID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    @Override
    public boolean addRoom(Room room) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateRoom(Room room) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteRoom(Long roomID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int deviceListPosition(Long deviceID){
        for (int i=0; i<listdevices.size();i++){
            if ( Objects.equals(((Device)listdevices.get(i)).getId(), deviceID) ){
                return i;
            }
        }
        return -1;
    }
    
        
}
