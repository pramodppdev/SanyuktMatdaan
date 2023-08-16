package com.sanyuktmatdaan;

public class CandidateModel {

    private String candidate_name;
    private String candidate_area;
    private String candidate_party;
    private String candidate_type;

    public CandidateModel() {
    }

    public CandidateModel(String candidate_name, String candidate_area, String candidate_party, String candidate_type) {
        this.candidate_name = candidate_name;
        this.candidate_area = candidate_area;
        this.candidate_party = candidate_party;
        this.candidate_type = candidate_type;
    }

    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    public String getCandidate_area() {
        return candidate_area;
    }

    public void setCandidate_area(String candidate_area) {
        this.candidate_area = candidate_area;
    }

    public String getCandidate_party() {
        return candidate_party;
    }

    public void setCandidate_party(String candidate_party) {
        this.candidate_party = candidate_party;
    }

    public String getCandidate_type() {
        return candidate_type;
    }

    public void setCandidate_type(String candidate_type) {
        this.candidate_type = candidate_type;
    }
}
