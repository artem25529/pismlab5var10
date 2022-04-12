package com.es.model;

import java.util.Arrays;
import java.util.List;

public enum YearName {
    PIG(Arrays.asList(2019, 2031)), RAT(Arrays.asList(2008, 2020)), BULL(Arrays.asList(2009, 2021)),
    TIGER(Arrays.asList(2010, 2022)), RABBIT(Arrays.asList(2011, 2023)), DRAGON(Arrays.asList(2024, 2012)),
    SNAKE(Arrays.asList(2025, 2013)), HORSE(Arrays.asList(2026, 2014)), GOAT(Arrays.asList(2027, 2015)),
    MONKEY(Arrays.asList(2028, 2016)), COCK(Arrays.asList(2029, 2017)), DOG(Arrays.asList(2018, 2030));

    private List<Integer> years;

    YearName(List<Integer> years) {
        this.years = years;
    }

    public List<Integer> getYears() {
        return years;
    }
}
