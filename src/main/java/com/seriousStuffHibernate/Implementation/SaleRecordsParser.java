package com.seriousStuffHibernate.Implementation;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.seriousStuffHibernate.Entities.SaleRecord;
import com.seriousStuffHibernate.Interfaces.ICSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;


public class SaleRecordsParser implements ICSVParser {

    @Override
    public List<SaleRecord> parse (String path) throws FileNotFoundException, IOException  {
        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        //initialize the CSVParser object
        CSVParser file = new CSVParser(new FileReader(path), format);
        // street,city,zip,state,beds,baths,sq__ft,type,sale_date,price,latitude,longitude
        List<SaleRecord> saleRecords = new ArrayList<>();
        for (CSVRecord record : file) {
            SaleRecord saleRecord = new SaleRecord(
                    record.get("street"),
                    record.get("city"),
                    record.get("zip"),
                    record.get("state"),
                    Integer.parseInt(record.get("beds")),
                    Integer.parseInt(record.get("baths")),
                    Float.parseFloat(record.get("sq__ft")),
                    record.get("type"),
                    record.get("sale_date"),
                    BigDecimal.valueOf(Double.parseDouble(record.get("price"))),
                    Float.parseFloat(record.get("latitude")),
                    Float.parseFloat(record.get("longitude")));
            saleRecords.add(saleRecord);
        }
        file.close();
        return saleRecords;
    }

    @Override
    public void writeToFile(List<?> rs) {

    }
}

