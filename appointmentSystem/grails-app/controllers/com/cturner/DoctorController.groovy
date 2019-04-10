package com.cturner

class DoctorController {

    def scaffold = Doctor

def login(){


}


def validate(){


def user2 = Doctor.findByDoctorUsername(params.username)

if(user2 && user2.doctorPassword == params.password){

session.user2 = user2

render view:'home'

}

else{


flash.message = "invalid username and password."

render view:'login'

}


}


def logout ={


session.user2 = null

redirect(uri:'/')


	}


}
