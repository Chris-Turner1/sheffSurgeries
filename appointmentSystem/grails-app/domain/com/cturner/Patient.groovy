package com.cturner

class Patient {

String patientName
String patientAddress
String patientResidence
Date   patientDob
String patientID
Date   dateRegistered
String patientPhone


    static constraints = 

{

      
      patientName         nullable:false, blank:false;
      patientAddress      nullable:false, blank:false;
      patientResidence    nullable:false, blank:false, inList:["Sheffield", "Barnsley", "Doncaster"];
      patientDob          nullable:false, blank:false;
      patientID           nullable:false, blank:false;
      dateRegistered      nullable:false, blank:false;
      patientPhone        nullable:false, blank:false;

    }

}
