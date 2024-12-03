package org.colleg.practice2.task5;

import java.util.ArrayList;
import java.util.List;

public class HospitalController {
    private List<HospitalAlert> alertHistory = new ArrayList<>();

    public void informAlert(HospitalAlert alert) {
        addAlert(alert);
        System.out.println("New alert: " + alert.getMessage());
    }

    public void addAlert(HospitalAlert alert) {
        alertHistory.add(alert);
    }
}


