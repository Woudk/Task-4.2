package org.colleg.practice2.task5;

import java.time.LocalDateTime;
public class HospitalAlert {
    private AlertSeverity severity;
    private String message;
    private LocalDateTime timestamp;
    private String departmentName;

    public HospitalAlert(AlertSeverity severity, String message, LocalDateTime timestamp, String departmentName) {
        this.severity = severity;
        this.message = message;
        this.timestamp = timestamp;
        this.departmentName = departmentName;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
