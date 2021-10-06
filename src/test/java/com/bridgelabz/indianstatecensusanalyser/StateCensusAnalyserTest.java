package com.bridgelabz.indianstatecensusanalyser;

import org.junit.Test;

import java.io.IOException;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StateCensusAnalyserTest {
	public static final String CSV_FILE_WITHOUT_HEADER = "//home/chethan/perfios/code/IndianStatesCensusAnalyserr/IndianStateCensusDataWithoutHeader.csv";
    public static final String INCORRECT_CSV_FILE = "/home/chethan/perfios/code/IndianStatesCensusAnalyserr/IndianStateCensusDataWithWrongDelimiter.csv";
    public static final String NOT_A_CSV_FILE = "//home/chethan/perfios/code/IndianStatesCensusAnalyserr/new.txt";
    public static final String FILE_NOT_EXIST = "incorrectFilePath.csv";
    public static final String CORRECT_CSV_FILE = "/home/chethan/perfios/code/IndianStateCensusAnalyserr/IndianStateCensusData.csv";
   

    @Test
    public void givenIndianCensusCSVFile_ShouldReturnCorrectRecords() throws StateCensusAnalyserException {
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            int count = analyser.loadIndianStateCensusData(CORRECT_CSV_FILE);
            assertEquals(29, count);
        }

        @Test
        public void givenCSVFile_ReturnException_ifFileNotPresent() throws StateCensusAnalyserException {
            StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			censusAnalyser.loadIndianStateCensusData(FILE_NOT_EXIST);
        }
        @Test
        public void givenIncorrectCSVFile_ThrowExceptionForIncorrectCSVFile() {
            try {
                StateCensusAnalyser stateCensusAnalyserMain = new StateCensusAnalyser();
                stateCensusAnalyserMain.loadIndianStateCensusData(NOT_A_CSV_FILE);
            } catch (StateCensusAnalyserException e) {
                assertEquals(StateCensusAnalyserException.CensusException.INCORRECT_TYPE_ISSUE, e.exceptionType);
            }
        }

}
