package com.seriousStuffHibernate.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ICSVParser {
    List<?> parse (String path) throws FileNotFoundException, IOException;
    void writeToFile (List<?> rs);
}
