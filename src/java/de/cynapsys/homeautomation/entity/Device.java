/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.cynapsys.homeautomation.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mouadh
 */
@XmlRootElement(name = "device")
public class Device {
    Long id;
    String name;
    String description;
    int currentValue;

    public Device() {
    }

    
    public Device(Long id, String name, String description, int currentValue) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.currentValue = currentValue;
    }

    @XmlElement
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @XmlAttribute
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", name=" + name + ", description=" + description + ", currentValue=" + currentValue + "}\n";
    }
    
    
}
