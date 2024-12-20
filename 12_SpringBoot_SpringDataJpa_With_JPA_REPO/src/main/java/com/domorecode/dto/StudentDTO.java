package com.domorecode.dto;




public class StudentDTO {
    private Long rank;
    private String gender;

    // Constructor
    public StudentDTO(Long rank, String gender) {
        this.rank = rank;
        this.gender = gender;
    }

    // Getters and Setters
    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
