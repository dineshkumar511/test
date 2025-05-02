//package
package org.example.event3;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;

//<class>
public class ClaimRequestEvent implements StreamEvent{
    private static final String NAME="ClaimRequestEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final int claimNumber;
private final int eTA;
private final String comment;

    //Constructor
public ClaimRequestEvent(ClaimRequestEventRequest req){
this.ClaimNumber=req.getClaimNumber();
this.ETA=req.getETA();
this.Comment=req.getComment();
}

    //Getter
@Override
public int getClaimNumber(){
return claimNumber;
}
@Override
public int getETA(){
return eTA;
}
@Override
public String getComment(){
return comment;
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
