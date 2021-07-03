package com.voyance.voyance.models;

public enum Role {
    DOCTOR, PATIENT;

    @Override
    public String toString() {
        switch (this){
            case DOCTOR: return  "Doctor";
            case PATIENT: return "Patient";
            default: return  null;
        }
    }


}
