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

    def surgery3 = new Surgery ( 
    surgeryName: 'City Health Centre',
    address: '21 Marble Street, Sheffield',
    postcode: 'S11 5TY',
    telephone: '0114 555 555',
    numberOfPatients: 30,
    description: 'Lorem Ipsum',
    openingTime: '09:00-17:00hrs').save()

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

    def doctor3 = new Doctor ( 
    doctorFullName: 'Sarah Macdonald',
    qualification: 'MB',
    position: 'GP',	
    doctorEmail: 's.macdonald@cityhealthcentre.gmail.com',
    doctorUsername: 'Sarah',
    doctorPassword: 'secret222',
    doctorOffice:'7522',
    doctorPhone:'0114 111 7387',
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
    
    def patient3 = new Patient ( 
    patientFullName: 'Tom Hanks',     
    patientAddress: '11 Eskdale Rd, S6 1ST',      
    patientResidence: 'Sheffield',    
    patientDob: new Date('09/07/1956'),          
    patientID: 33958,          
    dateRegistered: new Date('22/03/2010'),      
    patientPhone: '07426482000').save()

    def patient4 = new Patient ( 
    patientFullName: 'David Gilmour',     
    patientAddress: '61 Mare St, E8 1HY',      
    patientResidence: 'Sheffield',    
    patientDob: new Date('03/06/1946'),          
    patientID: 717,          
    dateRegistered: new Date('16/09/2000'),      
    patientPhone: '07464483085').save()

    def patient5 = new Patient ( 
    patientFullName: 'Simony Browny',     
    patientAddress: '86 Queens Rd, S2 4DR',      
    patientResidence: 'Sheffield',    
    patientDob: new Date('22/04/1986'),          
    patientID: 958,          
    dateRegistered: new Date('22/04/2010'),      
    patientPhone: '07450482077').save()

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

    def receptionist3 = new Receptionist ( 
    recepFullName: 'Daniel Foster',  
    recepEmail: 'd.receptionist@cityhealthcentre.gmail.com',     
    recepUsername: 'Daniel', 
    recepPassword: 'receptionist123',  
    recepPhone: '0114 225 2199' ).save()

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

    def nurse3 = new Nurse ( 
    nurseFullName: 'Peter Parker',  
    qualifications: 'BSC (HONOURS) General Nursing', 
    nurseEmail: 'p.p.generalnursing@gmail.com',     
    nurseOffice: '10009',    
    nursePhone: '07974803777').save()

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

    def appointment3 = new Appointment ( 
    appDate: new Date('04/04/2019'),     
    appTime: '15:00',      
    appDuration: '60',  
    roomNumber: '3355').save()

    def appointment4 = new Appointment ( 
    appDate: new Date('06/04/2019'),     
    appTime: '14:30',      
    appDuration: '45',  
    roomNumber: '1500').save()

    def appointment5 = new Appointment ( 
    appDate: new Date('08/04/2019'),     
    appTime: '10:00',      
    appDuration: '30',  
    roomNumber: '3355').save()
    
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

    def prescription3 = new Prescription (
    pharmacyFullName: 'lalaland Pharmacy',         
    prescripNumber: '381 000 2222',           
    medicine: 'Painkiller',                 
    totalCost: '8.50',                
    dateIssued: new Date('04/04/2019'),              
    patientPaying: false,            
    daysSupplyOfMedication: 28).save() 

    def prescription4 = new Prescription (
    pharmacyFullName: 'Asda Pharmacy',         
    prescripNumber: '378 043 2298',           
    medicine: 'BENYLIN Cough Medicine',                 
    totalCost: '8.50',                
    dateIssued: new Date('06/04/2019'),              
    patientPaying: true,            
    daysSupplyOfMedication: 28).save() 

    def prescription5 = new Prescription (
    pharmacyFullName: 'Tesco Pharmacy',         
    prescripNumber: '481 100 7222',           
    medicine: 'Oraldene Mouthwash 1ltr',                 
    totalCost: '8.50',                
    dateIssued: new Date('08/04/2019'),              
    patientPaying: false,            
    daysSupplyOfMedication: 28).save() 

     surgery1.addToReceptionists(receptionist1)
     surgery2.addToReceptionists(receptionist2)
     surgery3.addToReceptionists(receptionist3)

     prescription1.addToSurgerys(surgery1)
     prescription2.addToSurgerys(surgery2)
     prescription3.addToSurgerys(surgery3)
     prescription4.addToSurgerys(surgery1)
     prescription5.addToSurgerys(surgery3)

     surgery1.addToPatients(patient1)
     surgery2.addToPatients(patient2)
     surgery3.addToPatients(patient3)
     surgery1.addToPatients(patient4)
     surgery3.addToPatients(patient5)

     patient1.addToSurgerys(surgery1)
     patient2.addToSurgerys(surgery2)
     patient3.addToSurgerys(surgery3)
     patient4.addToSurgerys(surgery1)
     patient5.addToSurgerys(surgery3)

     patient1.addToPrescriptions(prescription1)
     patient2.addToPrescriptions(prescription2)
     patient3.addToPrescriptions(prescription3)
     patient4.addToPrescriptions(prescription4)
     patient5.addToPrescriptions(prescription5)

     doctor1.addToPrescriptions(prescription1)
     doctor2.addToPrescriptions(prescription2)
     doctor3.addToPrescriptions(prescription3)
     doctor1.addToPrescriptions(prescription4)
     doctor3.addToPrescriptions(prescription5)

     doctor1.addToAppointments(appointment1)
     doctor2.addToAppointments(appointment2)
     doctor3.addToAppointments(appointment3)
     doctor1.addToAppointments(appointment4)
     doctor3.addToAppointments(appointment5)

     doctor1.addToPatients(patient1)
     doctor2.addToPatients(patient2)
     doctor3.addToPatients(patient3)
     doctor1.addToPatients(patient4)
     doctor3.addToPatients(patient5)
     
     doctor1.addToNurses(nurse1)
     doctor2.addToNurses(nurse2)
     doctor3.addToNurses(nurse3)

     doctor1.addToSurgerys(surgery1)
     doctor2.addToSurgerys(surgery2)
     doctor3.addToSurgerys(surgery3)

     patient1.addToDoctors(doctor1)
     patient2.addToDoctors(doctor2)
     patient3.addToDoctors(doctor3)
     patient4.addToDoctors(doctor1)
     patient5.addToDoctors(doctor3)

     appointment1.addToSurgerys(surgery1)
     appointment2.addToSurgerys(surgery2)
     appointment3.addToSurgerys(surgery3)
     appointment4.addToSurgerys(surgery1)
     appointment5.addToSurgerys(surgery3)

     nurse1.addToSurgerys(surgery1)
     nurse2.addToSurgerys(surgery2)
     nurse3.addToSurgerys(surgery3)

     nurse1.addToDoctors(doctor1)
     nurse2.addToDoctors(doctor2)
     nurse3.addToDoctors(doctor3)
    

    }

    def destroy = {
    }
}
