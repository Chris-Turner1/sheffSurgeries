package com.cturner

class DoctorController {

    def scaffold = Doctor

def login(){


}


def validate(){


def user = Doctor.findByDoctorUsername(params.username)

if(user && user.doctorPassword == params.password){

session.user = user

render view:'home'

}

else{


flash.message = "invalid username and password."

render view:'login'

}


}


def logout ={


session.user = null

redirect(uri:'/')


	}

}
