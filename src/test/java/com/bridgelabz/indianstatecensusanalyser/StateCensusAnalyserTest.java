package com.bridgelabz.indianstatecensusanalyser;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class StateCensusAnalyserTest {
	 public static final String FILE_NOT_EXIST = "incorrectFilePath.csv";
    public static final String CORRECT_CSV_FILE = "//home/chethan/perfios/code/IndianStateCensusAnalyserr/IndianStateCensusData.csv";
   

    @Test
    	public void givenIndianCensusCSVFile_ShouldReturnCorrectRecords() throws IOException, StateCensusAnalyserException {
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            int count = analyser.loadIndianStateCensusData(CORRECT_CSV_FILE);
            assertEquals(29, count);
        }

        @Test
        public void givenCSVFile_ReturnException_ifFileNotPresent() throws IOException {
            StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			censusAnalyser.loadIndianStateCensusData(FILE_NOT_EXIST);
        }

}
