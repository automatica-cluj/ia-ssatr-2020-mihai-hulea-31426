/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.cur5.ssatr.ia.parking;

/**
 *
 * @author mihai.hulea
 */
public class CarLog {
  private String plateNumber;
  private long entryTime;
  private long exitTime;

    public CarLog(String plateNumber, long entryTime, long exitTime) {
        this.plateNumber = plateNumber;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public long getExitTime() {
        return exitTime;
    }

   
    
  
}
