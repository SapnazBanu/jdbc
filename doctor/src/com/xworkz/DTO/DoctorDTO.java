package com.xworkz.DTO;

public class DoctorDTO {

    private String name;
    private String specialization;
    private Integer experienceYears;
    private String hospitalName;
    private String email;
    private String phoneNumber;
    private boolean isActive;
    private double consultationFee;
    private String availability;
    private String gender;

    // Constructor
    public DoctorDTO(String name, String specialization, Integer experienceYears, String hospitalName,
            String email, String phoneNumber, boolean isActive, double consultationFee, String availability,
            String gender) {
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.hospitalName = hospitalName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.consultationFee = consultationFee;
        this.availability = availability;
        this.gender = gender;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public String getAvailability() {
        return availability;
    }

    public String getGender() {
        return gender;
    }

    // Setters (if you need them for updating values)
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
