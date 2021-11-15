# OopsProgramming Object-oriented programming is a computer programming model that organizes software design around data rather than functions and logic.
Inheritance is the mechanism of basing an object or class upon another object or class retainig similar implementation.
we have 3 java classes hospital.java , hospitalemployee.java , surgeon.java
HospitalEmployee.java: two protected varialbles number which is integer , name which is string  and a contructor to initailize variables , relavant getter and setter methods for var , a two string method and void method termed as work .
Doctor class will inherent  the hospital employee class , this has extra var called speciality which is string
another class called nurse extends the hosptial employee class , this has another int called NumOfPatients which is an int
A class called Surgeon will also extends hospital employee class , this has string var called operating and boolean var called value
the doctor ,nurse and surgeon classes will overrite the work method and two string method
The objects are created in the main class for alll the respective classes and these objects are used to invoke the specific methods of classes
To complie : javac hospital.java
To run : java hospital 
