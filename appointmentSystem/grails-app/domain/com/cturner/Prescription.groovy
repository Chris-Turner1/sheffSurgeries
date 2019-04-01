package com.cturner

class Prescription {

     String      pharmacyFullName
     String      prescripNumber
     String      medicine
     BigDecimal  totalCost
     Date        dateIssued
     Boolean     patientPaying
     int         daysSupplyOfMedication

     static hasMany=[surgerys:Surgery, doctors:Doctor]
     static belongsTo=[Surgery, Doctor]

     String toString(){
     return prescripNumber
}


    static constraints = 

{

      
      pharmacyFullName        nullable:false, blank:false;
      prescripNumber          nullable:false, blank:false;
      medicine                nullable:false, blank:false;
      totalCost               nullable:false, blank:false, scale:2;
      dateIssued              nullable:false, blank:false;
      patientPaying           nullable:false, blank:false;
      daysSupplyOfMedication  nullable:false, blank:false;

    }

}
