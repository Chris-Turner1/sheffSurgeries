package com.cturner

class Nurse {

     String nurseFullName
     String qualifications
     String nurseEmail
     String nurseOffice
     String nursePhone

     static hasMany=[surgerys:Surgery, doctors:Doctor]
     static belongsTo=[Surgery, Doctor]

   String toString(){
   return nurseFullName
}


    static constraints = 

     {

      
      nurseFullName  nullable:false, blank:false;
      qualifications nullable:false, blank:false;
      nurseEmail     nullable:false, blank:false;
      nurseOffice    nullable:false, blank:false;
      nursePhone     nullable:false, blank:false;
      

    }

}
