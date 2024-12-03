package org.colleg.practice2.task5;

import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {

        HospitalController controller = new HospitalController();

        EmailNotifier emailNotifier = new EmailNotifier("hospital_admin@gmail.com");
        SMSNotifier smsNotifier = new SMSNotifier("+0958642715");

        Observable notifierSystem = new Observable() {};
        notifierSystem.subscribe(emailNotifier);
        notifierSystem.subscribe(smsNotifier);

        HospitalAlert alert = new HospitalAlert(
                AlertSeverity.CRITICAL,
                "Code Red in Emergency Department!",
                LocalDateTime.now(),
                "Emergency"
        );

        controller.informAlert(alert);
        notifierSystem.notifyObservers(alert.getMessage());
    }
}
