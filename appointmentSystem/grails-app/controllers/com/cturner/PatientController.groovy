package com.cturner

class PatientController {

    def scaffold = Patient

def search(){


}

def results(String name){

def patients=Patient.where{
patientFullName=~name
}.list()

return [patients:patients,
term:params.name,
totalPatients: Patient.count()]

}

}




