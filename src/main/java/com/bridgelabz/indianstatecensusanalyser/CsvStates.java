package com.bridgelabz.indianstatecensusanalyser;

import com.opencsv.bean.CsvBindByName;

public class CsvStates {

    @CsvBindByName(column = "StateName",required = true)
    public String state;

    @CsvBindByName(column = "StateCode", required = true)
    public String stateCode;
}