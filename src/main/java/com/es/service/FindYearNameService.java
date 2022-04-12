package com.es.service;

import com.es.model.YearName;

import javax.ejb.Singleton;
import java.util.Arrays;

@Singleton
public class FindYearNameService {
    public String find(int year) {
        YearName res = Arrays.stream(YearName.values())
                .filter(yearName -> yearName.getYears().contains(year))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Year name not found"));

        return res.toString();
    }
}
