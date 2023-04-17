># SRS Doctors Appoinment

**Document:** System Requirement Specification Document

**Title:** Online Doctor Appointment System Document.  
   
**Team:** 10  

    Snehal Patil (233180)  
    Neha Kewate (233172)  
    Mohan Talavar (233169)  
    Shubham Ghodkhande (233212)  
    Harshal Nagtilak (233170)  
    Ashish Borole (233138)  
    Pranay Patil (233185)      

**Objective:**    

- The online booking for doctor’s appointment system web application is intended to 
provide a solution for the users to find a list of the doctors in a particular hospital and 
their schedule as well as their availability so the user could get a clear idea and book the 
appointment with ease. No need to visit the hospital physically.

**Scope:**  

* The online booking system will allow patients to book appointments with doctors and 
hospitals through a web-based platform.  

+ The system will also provide doctors and hospitals with a way to manage their 
appointments and patient information.  

**Functional requirements:**

- User Registration and Login: Patients should be able to register on the system with their personal details and login credentials.  

* Appointment Tracking: Patients should be able to track the status of their appointment requests and receive notifications about any changes.   

* Appointment Booking: Registered patients should be able to request for an appointment with a doctor of their choice. They should be able to search for doctors based on name, specialty, and availability. The system should notify the patient about the availability of the doctor.      

* Appointment Scheduling: The staff should be able to schedule appointments based on the availability of doctors.  

* Appointment Rescheduling: The patient should be able to request for rescheduling of an appointment, and the staff should be able to reschedule the appointment based on the availability of the doctor.  

* Appointment Reminders: The system should provide reminders to the patients about their upcoming appointments.  

* Doctor can reschedule or cancel the appointment.  

* Lab Test Booking: Patients should be able to book a lab test and provide necessary details for the same.  

* Medical Records: Patients should be able to view their medical records, lab test reports, prescriptions, and receipts on their dashboard.  

* Waiting List: The system should maintain a waiting list and allow patients to join it if the doctor is not currently available.  

* Doctor Availability Management: The system should allow doctors to update their availability status.  

* Online Payment: Patients should be able to pay online for appointments and lab tests.  

+ Cancel/Reschedule Appointment: Patients should be allowed to cancel or reschedule appointments within a specified time 
limit after the first appointment request.  

**Non-functional Requirements:**
 Usability:
The platform should be easy to use and navigate, with a user-friendly interface.
 Availability:
The system should be available 24/7, with minimal downtime or maintenance issues.
 Compatibility:
The system should be compatible with different devices and web browsers.
 Reliability:
The system will back up all the data on a regular basis and recover in short time duration 
to keep the system operational. The system should be able to handle a large number of 
users.
 Scalability:
The system should be scalable to accommodate future growth and expansion.
 Security:
Only registered patients will be allowed to book an appointment of a particular doctor 
and that patient must go through an authentication process.
System will provide access to the content, operation using role based security 
(authorization),i.e permission based on role.
User confidential data will always be encrypted access communication.
 Maintainability:
Healthcare database software will be used to maintain System data Persistence.
Where the IT operation team will easily monitor and configure the System using 
administrative tools provided by Servers.
 Portability:
The Portable Device Application system will provide a portable User Interface ( HTML, 
CSS, JS) through which users will be able to access online appointment portals.
System can be deployed to single server, multi-server, to any OS, Cloud (Azure or AWS 
or GCP)
 Durability:
System will retain the portal for 15 minutes even though the user loses internet 
connection and joins again.
System will maintain a wish list of doctors' for patients. The patient will be able to book 
appointments from the wish list whenever needed.
 Efficiency:
If there is high load of patients who are booking there appointments then system will be 
efficient enough to handle all the patients and their appointments with same response 
time.
 Safety:
Online appointment portal will be secure from malicious attack, fishing.
Online appointment portal functionalities are protected from outside with proper firewall 
configuration.
Conclusion:
The e-Hospital Appointment System is an essential tool for patients and doctors to efficiently 
manage appointments in hospitals. The system's user-friendly interface, coupled with its robust 
functionalities, makes it an ideal solution for booking, rescheduling, and cancelling 
appointments.
For E-R Diagram
Business Entities:
1. Patient: patient id, name, phone number, address.
2. Doctor: doctor id, name, specialization, rating, email.
3. Appointment: appointment id, patient id, doctor id, appointment date, time.
4. Lab Test: test id, patient id, test name.
Functional operations List:
 validate user
 change password
 forgot password
 get user details
 Login
 Logout
 Notify the patient about the availability of the doctor.
 Appointment Tracking by patient
 Request for an appointment
 search for doctors based on name
 cancellation of appointment by the doctor
 cancellation of appointment by the patient
 Rescheduling request of an appointment by patient
 Appointment Reminders:
 book a lab test
 view medical records
 maintain a waiting list
 update doctor’s availability status
 online payment for appointments and lab tests
