package com.bridgelabz.indianstatecensusanalyser;


public class CsvLoader<T> {

    @SuppressWarnings("unchecked")
	public int loadCSVFile(String filePath, Class<CSVStateCensus> csvStateCensusClass) throws StateCensusAnalyserException {
    	Class<CSVStateCensus> csvStateCensusClass1 = CSVStateCensus.class;
        CsvLoader loader = new CsvLoader<CSVStateCensus>();
       return loader.loadCSVFile(filePath,csvStateCensusClass1);
    }
}
