package com.cturner

class Patient {

   String patientFullName
   String patientAddress
   String patientResidence
   Date   patientDob
   int    patientID
   Date   dateRegistered
   String patientPhone

   static hasMany=[prescriptions:Prescription, doctors:Doctor, surgerys:Surgery]
   static belongs=[Surgery, Doctor] 

   String toString(){
   return patientFullName
}


    static constraints = 

{

      
      patientFullName     nullable:false, blank:false;
      patientAddress      nullable:false, blank:false;
      patientResidence    nullable:false, blank:false, inList:["Sheffield", "Barnsley", "Doncaster"];
      patientDob          nullable:false, blank:false, date:true;
      patientID           nullable:false, blank:false, unique:true, size:6;
      dateRegistered      nullable:false, blank:false, date:true;
      patientPhone        nullable:false, blank:false;

    }

}
