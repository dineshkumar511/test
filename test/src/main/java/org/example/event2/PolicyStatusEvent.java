//package
package org.example.event2;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;

//<class>
public class PolicyStatusEvent implements StreamEvent{
    private static final String NAME="PolicyStatusEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final String policyHolder;
private final DateTime policyEndDate;
private final String status;

    //Constructor
public PolicyStatusEvent(PolicyStatusEventRequest req){
this.PolicyHolder=req.getPolicyHolder();
this.PolicyEndDate=req.getPolicyEndDate();
this.Status=req.getStatus();
}

    //Getter
@Override
public String getPolicyHolder(){
return policyHolder;
}
@Override
public DateTime getPolicyEndDate(){
return policyEndDate;
}
@Override
public String getStatus(){
return status;
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
