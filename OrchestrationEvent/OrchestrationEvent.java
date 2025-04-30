package com.eisgroup.genesis.events;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;


public class OrchestrationEventEvent implements StreamEvent{
    private static final String NAME="OrchestrationEventEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final String end;
private final int duration;

    //Constructor
public OrchestrationEvent(OrchestrationEventRequest req){
this.End=req.getEnd();
this.Duration=req.getDuration();
}

    //Getter
@Override
public String getEnd(){
return end;
}
@Override
public int getDuration(){
return duration;
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
