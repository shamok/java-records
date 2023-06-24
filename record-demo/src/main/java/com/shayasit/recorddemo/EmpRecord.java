package com.shayasit.recorddemo;

import java.util.Map;

public record EmpRecord(int id, String name, long salary, Map<String, String> addresses) {

    public EmpRecord {
        if (id < 0)
            throw new IllegalArgumentException("employee id cannot be negative");

        if (salary < 0)
            throw new IllegalArgumentException("employee salary cannot be negative");
    }
}
