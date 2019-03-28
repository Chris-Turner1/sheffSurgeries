package com.cturner

class Surgery {

    String surgeryName
    String address
    String postcode
    String telephone
    int    numberOfPatients
    String description
    Float openingTime


   static hasMany=[doctors:Doctor, receptionists:Receptionist, nurses:Nurse, patients:Patient, appointments: Appointment] 



    static constraints = 

{

      
      surgeryName      nullable:false, blank:false;
      address          nullable:false, blank:false;
      postcode         nullable:false, blank:false;
      telephone        nullable:false, blank:false, unique:true;
      numberOfPatients nullable:false, blank:false, min:1, max:50;
      description      nullable:false, blank:false, maxSize:5000, widget:'textarea';
      openingTime      nullable:false, blank:false, scale:2, min:7.00F, max:11.00F;


    }

}
