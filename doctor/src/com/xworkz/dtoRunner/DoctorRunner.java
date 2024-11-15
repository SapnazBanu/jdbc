package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.xworkz.DTO.DoctorDTO;
import com.xworkz.enumConnection.ConnectionEnum;

public class DoctorRunner {
	public static void main(String[] args) {

		DoctorDTO doctorDto1 = new DoctorDTO("Dr. John Smith", "Cardiology", 15, "City Hospital",
				"john.smith@cityhospital.com", "5698754695", true, 2000, "Mon-Fri", "Male");

		DoctorDTO doctorDto2 = new DoctorDTO("Dr. Divya Ramesh", "Neurology", 10, "Metro Health",
				"divya.ramesh@metrohealth.com", "+1-987-654-321", false, 2500, "Tue-Thu: 10 AM - 2 PM", "Female");

		DoctorDTO doctorDto3 = new DoctorDTO("Dr. Supritha Rao", "Orthopedics", 8, "Kalyani Hospital",
				"supritha.rao@kalyanihospital.com", "+1-556-998-123", true, 1800, "Mon-Wed: 11 AM - 4 PM", "Female");

		DoctorDTO doctorDto4 = new DoctorDTO("Dr. Prathi Manjunath", "Dermatology", 12, "Green Cross Hospital",
				"prathi.manjunath@greencross.com", "+1-667-890-123", true, 2200, "Mon-Sat", "Female");

		DoctorDTO doctorDto5 = new DoctorDTO("Dr. Rachana Nair", "Pediatrics", 9, "Prime Care Hospital",
				"rachana.nair@primecare.com", "+1-998-776-543", true, 1500, "Mon-Fri", "Female");

		DoctorDTO doctorDto6 = new DoctorDTO("Dr. Akshay Gowda", "General Medicine", 14, "MediCenter",
				"akshay.gowda@medicenter.com", "+1-334-555-789", true, 1800, "Mon-Fri", "Male");

		DoctorDTO doctorDto7 = new DoctorDTO("Dr. Lasya Kiran", "ENT", 6, "Health First Hospital",
				"lasya.kiran@healthfirst.com", "+1-776-554-221", true, 1600, "Mon-Fri", "Female");

		DoctorDTO doctorDto8 = new DoctorDTO("Dr. Jeevan Kumar", "Oncology", 11, "Pinnacle Care",
				"jeevan.kumar@pinnaclecare.com", "+1-223-887-654", true, 3000, "Mon-Fri", "Male");

		DoctorDTO doctorDto9 = new DoctorDTO("Dr. Anil Kumar", "Radiology", 13, "City Hospital",
				"anil.kumar@cityhospital.com", "+1-555-333-111", true, 2300, "Mon-Sat", "Male");

		DoctorDTO doctorDto10 = new DoctorDTO("Dr. Sushma Shetty", "Gynecology", 7, "Sunshine Clinic",
				"sushma.shetty@sunshineclinic.com", "+1-876-654-432", true, 2000, "Tue-Sat", "Female");

		DoctorDTO[] doctors = { doctorDto1, doctorDto2, doctorDto3, doctorDto4, doctorDto5, doctorDto6, doctorDto7,
				doctorDto8, doctorDto9, doctorDto10 };

		Connection connection = null;
		PreparedStatement pst = null;

		try {

			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			pst = connection.prepareStatement("INSERT INTO doctor_table (name, specialization, experience_years, "
					+ "hospital_name, email, phone_number, is_active, consultation_fee, availability, gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			for (DoctorDTO dto : doctors) {
				pst.setString(1, dto.getName());
				pst.setString(2, dto.getSpecialization());
				pst.setInt(3, dto.getExperienceYears());
				pst.setString(4, dto.getHospitalName());
				pst.setString(5, dto.getEmail());
				pst.setString(6, dto.getPhoneNumber());
				pst.setBoolean(7, dto.isActive());
				pst.setDouble(8, dto.getConsultationFee());
				pst.setString(9, dto.getAvailability());
				pst.setString(10, dto.getGender());

				pst.addBatch();
			}

			int[] count = pst.executeBatch();
			for (int c : count) {
				if (c > 0) {
					System.out.println("Doctor record saved successfully.");
				} else {
					System.out.println("Doctor record not saved.");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
