package bankingSystem.src;

import java.util.Scanner;
import java.util.LinkedList;


public class Person
{
        private final long UID;
        private String firstName;
        private String lastName;
        private int date,month,year;
        private String DOB;

        public Person(long UID, String firstName, String lastName, int date, int month, int year)
        {
                this.UID = UID;
                this.firstName = firstName;
                this.lastName = lastName;
                this.date = date;
                this.month = month;
                this.year = year;
        }

        public long getUID()
        {
                return UID;
        }

        public String getFullName()
        {
                return (firstName + " " + lastName);
        }

        public String getDOB()
        {
                return (date+"/"+ month + "/" +year);
        }

        
}