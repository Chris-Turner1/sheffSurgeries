package com.cturner

class Receptionist {

    String recepFullName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    static hasMany=[surgerys:Surgery]
    static belongsTo=[Surgery]

    static constraints = 

{

      
      recepFullName  nullable:false, blank:false;
      recepEmail     nullable:false, blank:false, email:true, unique:true;
      recepUsername  nullable:false, blank:false, unique:true;
      recepPassword  nullable:false, blank:false;
      recepPhone     nullable:false, blank:false, unique:true;
      

    }

}
