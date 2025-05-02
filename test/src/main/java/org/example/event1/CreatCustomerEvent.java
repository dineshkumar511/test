//package
package org.example.event1;

import java.time.LocalDateTime;
import com.eisgroup.genesis.events.StreamEvent;

//<class>
public class CreatCustomerEvent implements StreamEvent{
    private static final String NAME="CreatCustomerEvent";
    private final LocalDateTime occuredAtTime=LocalDateTime.now();

     //Variable
private final String  customerName;
private final int customerAge;

    //Constructor
public CreatCustomerEvent(CreatCustomerEventRequest req){
this.CustomerName=req.getCustomerName();
this.CustomerAge=req.getCustomerAge();
}

    //Getter
@Override
public String  getCustomerName(){
return customerName;
}
@Override
public int getCustomerAge(){
return customerAge;
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
