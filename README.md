# voyance-code-challenge
# About
VoyanceHealth is a simple hospital application that allows users to book an appointment via email.

# Functional Requiements
The following functional requirements have been tested
Users (doctors and patients) can be added to the platform.
Users (doctors and patients) can be delted from the platform.
Appointments can be booked.
Appointments can be deleted.

# Running the Project 


  - To set-up this project locally, you must have the following installed locally:
       - minimum of JDK 8
       - Apache maven 3.6.3 and above
       - SpringBoot version _ and above
       - Mysql version 5.x+

   At the root of the project run this command `mvn clean install` This would run both the main application and, the associated tests
   
   # APIs
   "ap1/v1/addUser" this endpoints allow you to add a user (doctor/patient). It is a post request that takes in the following body.
   ```
   {"email":"email@email.com",
   "firtsName": "someone"
   "lastName": "son",
   Gender: "Male",
   "Role": "Patient",
   "password":"somepassword"
   }
   ```
   It returns the following 
   
   ```
   {"email": "email@email.com",
   "firstName": "someone",
   "lastName":"son"
   }
   ```
   "api/v1/deleteUser" Takes user email and deletes the user from the database
   ```
   params Key = email value="email@email.com"
   ```
   It returns a String status 
   ```
   You have successfullyy deleted this user
   ```
   "api/v1/bookAppointment - takes in only one parameter in the body, the user's email.
   
   ```
   {"patientsEmail":"email@email.com"
   }
   ```
   It returns the following 
   
  ```
  {"id": 5,
    "appointmentStatus": "AVAILABLE",
    "appointmentTime": "2021-07-08T18:15:28.309+00:00"
    }
 ```
   
   
