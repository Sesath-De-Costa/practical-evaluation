package com.rootcode.interview.practicle.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Sesath De Costa on 2021-03-30
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public class LoadDataFromXLSX {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("/home/sesath/Downloads/Country code Alpha-2 Alpha-3 conversion dataset.xlsx");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        for (CSVRecord record : records) {
            String country = record.get("Country");
            String alpha2Code = record.get("Alpha-2 code");
            String alpha3Code = record.get("Alpha-3 code");
            String num = record.get("Numeric");

            System.out.println(country + " " + alpha3Code + " " + alpha2Code);
        }
    }
}
