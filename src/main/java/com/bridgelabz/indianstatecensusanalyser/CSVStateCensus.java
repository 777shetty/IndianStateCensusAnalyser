package com.bridgelabz.indianstatecensusanalyser;


import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {
    @CsvBindByName(column = "State", required = true)
    String state;

    @CsvBindByName(column = "Population", required = true)
    float population;

    @CsvBindByName(column = "AreainSqKM", required = true)
    float areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKM", required = true)
    float densityPerSqKm;

    public CSVStateCensus(String state, float population, float areaInSqKm, float densityPerSqKm) {
        super();
        this.state = state;
        this.population = population;
        this.areaInSqKm = areaInSqKm;
        this.densityPerSqKm = densityPerSqKm;
    }

    public CSVStateCensus() {
        super();
    }
}