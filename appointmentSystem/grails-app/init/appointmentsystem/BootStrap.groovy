package com.cturner

class BootStrap {

def init = { servletContext ->

    def surgery1 = new Surgery ( 
    surgeryName: 'Northern General Hospital',
    address: 'Herries Rd, Sheffield',
    postcode: 'S5 7AU',
    telephone: '0114 243 4343',
    numberOfPatients: 45,
    description: 'Lorem Ipsum',
    openingTime: '24hrs').save()

    def surgery2 = new Surgery ( 
    surgeryName: 'Royal Hallamshire Hospital',
    address: 'Glossop Rd, Sheffield',
    postcode: 'S10 2JF',
    telephone: '0114 271 1900',
    numberOfPatients: 48,
    description: 'Lorem Ipsum',
    openingTime: '24hrs').save()

    def doctor1 = new Doctor ( 
    doctorFullName: 'Tonderai Maswera',
    qualification: 'MBBS',
    position: 'Surgeon',	
    doctorEmail: 't.doctor@northerngeneralhospital.gmail.com',
    doctorUsername: 'Tonderai',
    doctorPassword:'doctor123',
    doctorOffice: '9417',
    doctorPhone: '0114 333 1212',
    bio: 'Lorem Ispsum').save()

    def doctor2 = new Doctor ( 
    doctorFullName: 'George Phillip',
    qualification: 'MB',
    position: 'GP',	
    doctorEmail: 'g.doctor@royalhallamshirehospital.gmail.com',
    doctorUsername: 'George',
    doctorPassword: 'doctor123',
    doctorOffice:'9321',
    doctorPhone:'0114 432 7777',
    bio:'Lorem Ipsum').save()

    def patient1 = new Patient ( 
    patientFullName: 'Chris Turner',     
    patientAddress: '53 Holland Rd, S2 4UT',      
    patientResidence: 'Sheffield',    
    patientDob: new Date('21/01/1993'),          
    patientID: 20682,          
    dateRegistered: new Date('25/10/2018'),      
    patientPhone: '07933782368').save()
   
    def patient2 = new Patient ( 
    patientFullName: 'Greg Smith',     
    patientAddress: '9 Eskdale Rd, S6 1ST',      
    patientResidence: 'Sheffield',    
    patientDob: new Date('12/02/1993'),          
    patientID: 11958,          
    dateRegistered: new Date('25/10/2015'),      
    patientPhone: '07426482306').save()

    def receptionist1 = new Receptionist ( 
    recepFullName: 'Margaret Thompson',  
    recepEmail: 'm.receptionist@northerngeneralhospital.gmail.com',     
    recepUsername: 'Margaret', 
    recepPassword: 'receptionist123',  
    recepPhone: '0114 225 3158' ).save()

    def receptionist2 = new Receptionist ( 
    recepFullName: 'Alex Woods',  
    recepEmail: 'a.receptionist@northerngeneralhospital.gmail.com',     
    recepUsername: 'Alex', 
    recepPassword: 'receptionist123',  
    recepPhone: '0114 225 2138' ).save()

    def nurse1 = new Nurse ( 
    nurseFullName: 'Zayne Zameer',  
    qualifications: 'BSC (HONOURS) General Nursing', 
    nurseEmail: 'z.generalnursing@gmail.com',     
    nurseOffice: '10007',    
    nursePhone: '07742356545').save()

    def nurse2 = new Nurse ( 
    nurseFullName: 'Zain Islam',  
    qualifications: 'BSC (HONOURS) General Nursing', 
    nurseEmail: 'z.i.generalnursing@gmail.com',     
    nurseOffice: '10002',    
    nursePhone: '07974803222').save()

    def appointment1 = new Appointment ( 
    appDate: new Date('25/03/2019'),     
    appTime: '9:00',      
    appDuration: '45',  
    roomNumber: '1500').save()

    def appointment2 = new Appointment ( 
    appDate: new Date('31/03/2019'),     
    appTime: '16:00',      
    appDuration: '30',  
    roomNumber: '1111').save()
    
    def prescription1 = new Prescription ( 
    pharmacyFullName: 'Boots Pharmacy',         
    prescripNumber: '999 000 3877',           
    medicine: 'Codeine (high dose)',                 
    totalCost: '24.00',                
    dateIssued: new Date('31/03/2019'),              
    patientPaying: true,            
    daysSupplyOfMedication: 84).save()  

    def prescription2 = new Prescription (
    pharmacyFullName: 'Abbeydale Pharmacy',         
    prescripNumber: '111 000 2277',           
    medicine: 'Diazepam',                 
    totalCost: '8.50',                
    dateIssued: new Date('25/03/2019'),              
    patientPaying: false,            
    daysSupplyOfMedication: 28).save()  

//   surgery1.addToReceptionists(receptionist1)
//   patient1.addToPrescriptions(prescription1)
//   doctor1.addToAppointments(appointment1)

     surgery1.addToReceptionists(receptionist1)
     surgery2.addToReceptionists(receptionist2)

     patient1.addToPrescriptions(prescription1)
     patient2.addToPrescriptions(prescription2)

     doctor1.addToPrescriptions(prescription1)
     doctor2.addToPrescriptions(prescription2)

     doctor1.addToAppointments(appointment1)
     doctor2.addToAppointments(appointment2)

     doctor1.addToPatients(patient1)
     doctor2.addToPatients(patient2)
     
     doctor1.addToNurses(nurse1)
     doctor2.addToNurses(nurse2)

     doctor1.addToSurgerys(surgery1)
     doctor2.addToSurgerys(surgery2)

     patient1.addToDoctors(doctor1)
     patient2.addToDoctors(doctor2)

     appointment1.addToSurgerys(surgery1)
     appointment2.addToSurgerys(surgery2)

     nurse1.addToSurgerys(surgery1)
     nurse2.addToSurgerys(surgery2)

     nurse1.addToDoctors(doctor1)
     nurse2.addToDoctors(doctor2)
    

    }

    def destroy = {
    }
}
