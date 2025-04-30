package com.eisgroup.genesis.events;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;


public class ModuleEventEvent implements StreamEvent{
    private static final String NAME="ModuleEventEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final int duration;

    //Constructor
public ModuleEvent(ModuleEventRequest req){
this.Duration=req.getDuration();
}

    //Getter
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
