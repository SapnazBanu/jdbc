package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import com.xworkz.DTO.DoctorDTO;
import com.xworkz.enumConnection.ConnectionEnum;

public class SelectQuery1 {

    public static void main(String[] args) {

       
        String query = "SELECT * FROM doctor_table";

        try {
           
            Connection connection = DriverManager.getConnection(
                    ConnectionEnum.URL.getValue(), 
                    ConnectionEnum.USERNAME.getValue(), 
                    ConnectionEnum.PASSWORD.getValue()
            );
            
            
            Statement statement = connection.createStatement();
            
          
            ResultSet resultSet = statement.executeQuery(query);
            
           
            if (!resultSet.next()) {
                System.out.println("No data found in database");
            } else {
                
                do {
                    
                    String name = resultSet.getString("name");
                    String specialization = resultSet.getString("specialization");
                    int experienceYears = resultSet.getInt("experience_years");
                    String hospitalName = resultSet.getString("hospital_name");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phone_number");
                    boolean isActive = resultSet.getBoolean("is_active");
                    double consultationFee = resultSet.getDouble("consultation_fee");
                    String availability = resultSet.getString("availability");
                    String gender = resultSet.getString("gender");

                    
                    DoctorDTO doctorDTO = new DoctorDTO(name, specialization, experienceYears, hospitalName, 
                            email, phoneNumber, isActive, consultationFee, availability, gender);
                    
                    
                    System.out.println("Doctor Name: " + doctorDTO.getName());
                    System.out.println("Specialization: " + doctorDTO.getSpecialization());
                    System.out.println("Experience: " + doctorDTO.getExperienceYears() + " years");
                    System.out.println("Hospital Name: " + doctorDTO.getHospitalName());
                    System.out.println("Email: " + doctorDTO.getEmail());
                    System.out.println("Phone Number: " + doctorDTO.getPhoneNumber());
                    System.out.println("Active: " + doctorDTO.isActive());
                    System.out.println("Consultation Fee: " + doctorDTO.getConsultationFee());
                    System.out.println("Availability: " + doctorDTO.getAvailability());
                    System.out.println("Gender: " + doctorDTO.getGender());
                    System.out.println("----------------------------------------------------");
                    
                } while (resultSet.next());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
