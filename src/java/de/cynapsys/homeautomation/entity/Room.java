/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.entity;

import com.sun.xml.internal.ws.api.ha.HaInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mouadh
 */
public class Room {
    
    Long id;
    String name;
    String description;
    Set<Device> devices;

    public Room() {
        devices = new HashSet<>();
    }

    public Room(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.devices = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }
    
    
    
    public void addDevice(Device d){
        devices.add(d);
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
