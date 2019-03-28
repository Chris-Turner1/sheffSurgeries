package com.cturner

class Appointment {


     Date   appDate
     Float  appTime
     String appDuration
     String roomNumber

     static hasMany=[surgerys:Surgery, doctors:Doctor]
     static belongsTo=[Doctor, Surgery]

    static constraints = 
      {
      appDate      nullable:false, blank:false;
      appTime      nullable:false, blank:false, scale:2, min:8.30F, max:18.00F;
      appDuration  nullable:false, blank:false, inList:["30", "45", "60"];
      roomNumber   nullable:false, blank:false, size:4..6;


    }

}
