package org.colleg.practice2.task5;

import java.util.ArrayList;
import java.util.List;

public class HospitalController extends Observable{
    private List<HospitalAlert> alertHistory = new ArrayList<>();

    public void informAlert(HospitalAlert alert) {
        addAlert(alert);
        notifyObservers(alert.getMessage());
        System.out.println("New alert: " + alert.getMessage());
    }

    public void addAlert(HospitalAlert alert) {
        alertHistory.add(alert);
    }
}


