package com.cturner

class Doctor {

    String doctorFullName
    String qualification
    String position
    String doctorEmail
    String doctorUsername
    String doctorPassword
    String doctorOffice
    String doctorPhone
    String bio

  static hasMany=[prescriptions:Prescription, surgerys:Surgery, appointments:Appointment, nurses:Nurse, patients: Patient] 
  static belongsTo=[Patient, Surgery]

    static constraints = 

{

      
      doctorFullName   nullable:false, blank:false;
      qualification    nullable:false, blank:false;
      position         nullable:false, blank:false, inList:["GP", "Surgeon"];
      doctorEmail      nullable:false, blank:false, email:true, unique:true;
      doctorUsername   nullable:false, blank:false, unique:true;
      doctorPassword   nullable:false, blank:false;
      doctorOffice     nullable:false, blank:false, size:4..6;
      doctorPhone      nullable:false, blank:false;
      bio              nullable:false, blank:false, maxSize:5000, widget:'textarea';

    }

}
