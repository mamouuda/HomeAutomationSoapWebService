/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.cynapsys.homeautomation.service;

import de.cynapsys.homeautomation.entity.Device;
import de.cynapsys.homeautomation.entity.Room;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author mouadh
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DevicesService {
    
                                        /*******************
                                         * *****************
                                         * device functions*
                                         * *****************
                                         * *****************/
    @WebMethod
    ArrayList<Device> getAllDevices();
    
    @WebMethod 
    Device getDeviceByID(@WebParam(name = "deviceID") Long deviceID);
    
    @WebMethod
    int getValue(@WebParam(name = "deviceID") Long deviceID);
    
    @WebMethod
    boolean setValue(@WebParam(name = "deviceID") Long deviceID, @WebParam(name = "value") int value);
    
    @WebMethod
    Long addDevice(@WebParam(name = "device")Device device);
    
    @WebMethod
    boolean deleteDevice(@WebParam(name = "deviceID") Long deviceID);
    
    @WebMethod
    boolean updateDevice(@WebParam(name = "device")Device device);
    
    
                                        /*****************
                                         * ***************
                                         * room functions*
                                         * ***************
                                         * ***************/
    
    @WebMethod
    boolean addRoom(@WebParam(name = "room")Room room);
    
    @WebMethod
    boolean updateRoom(@WebParam(name = "room")Room room);
    
    @WebMethod
    boolean deleteRoom(@WebParam(name = "roomID") Long roomID);
    
    @WebMethod
    boolean attachDeviceToRoom(@WebParam(name = "deviceID") Long deviceID,@WebParam(name = "roomID") Long roomID);
    
    @WebMethod
    boolean detachDeviceFromRoom(@WebParam(name = "deviceID") Long deviceID,@WebParam(name = "roomID") Long roomID);
    
}