package com.cturner

class Prescription {

     String      pharmacyFullName
     String      prescripNumber
     String      medicine
     BigDecimal  totalCost
     Date        dateIssued
     Boolean     patientPaying
     int         medicationSupply

     static hasMany=[surgerys:Surgery, doctors:Doctor]
     static belongsTo=[Surgery, Doctor]


    static constraints = 

{

      
      pharmacyFullName  nullable:false, blank:false;
      prescripNumber    nullable:false, blank:false;
      medicine          nullable:false, blank:false;
      totalCost         nullable:false, blank:false;
      dateIssued        nullable:false, blank:false;
      patientPaying     nullable:false, blank:false, scale:2;
      medicationSupply  nullable:false, blank:false;

    }

}
