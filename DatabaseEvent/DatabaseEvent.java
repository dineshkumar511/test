package com.eisgroup.genesis.events;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;


public class DatabaseEventEvent implements StreamEvent{
    private static final String NAME="DatabaseEventEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final int timeout;
private final int responseTime;

    //Constructor
public DatabaseEvent(DatabaseEventRequest req){
this.Timeout=req.getTimeout();
this.ResponseTime=req.getResponseTime();
}

    //Getter
@Override
public int getTimeout(){
return timeout;
}
@Override
public int getResponseTime(){
return responseTime;
}
@Override
public String getName(){
return name;
}
@Override
public LocalDateTime getOccuredAtTime(){
return occuredAtTime;
}
}
