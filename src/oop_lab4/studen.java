package oop_lab4;

public class studen {
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class StudenData {
        public static BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        public static String getName() throws IOException{
            System.out.print("Enter your Name: ");
            return reader.readLine();
        }//getName

        public static String getaddress() throws IOException{
            System.out.print("Enter your address: ");
            return reader.readLine();
        }
        public static String getStuID() throws IOException{
            System.out.print("Enter your ID: ");
            return reader.readLine();
        }
        public static String getFaculty() throws IOException{
            System.out.print("Enter your Faculty: ");
            return reader.readLine();
        }
        public static String getemail() throws IOException{
            System.out.print("Enter your email: ");
            return reader.readLine();
        }



        public static void main (String[] args) throws IOException{
            String name = getName();
            String address = getaddress();
            String ID = getStuID();
            String fac = getFaculty();
            String email = getemail();
            System.out.println(name+"\n"+address+"\n"+ID+"\n"+fac+"\n"+email);
            System.out.println(getName()+"\n"+getaddress());





        }
    }
