
package com.github.highcharts4gwt.model.highcharts.option.api;


public interface Data {


    String csv();

    Data csv(String csv);

    String dateFormat();

    Data dateFormat(String dateFormat);

    double endColumn();

    Data endColumn(double endColumn);

    double endRow();

    Data endRow(double endRow);

    String googleSpreadsheetKey();

    Data googleSpreadsheetKey(String googleSpreadsheetKey);

    String googleSpreadsheetWorksheet();

    Data googleSpreadsheetWorksheet(String googleSpreadsheetWorksheet);

    String itemDelimiter();

    Data itemDelimiter(String itemDelimiter);

    String lineDelimiter();

    Data lineDelimiter(String lineDelimiter);

    String seriesMapping();

    Data seriesMapping(String seriesMappingAsJsonStringArray);

    double startColumn();

    Data startColumn(double startColumn);

    double startRow();

    Data startRow(double startRow);

    boolean switchRowsAndColumns();

    Data switchRowsAndColumns(boolean switchRowsAndColumns);

    String table();

    Data table(String table);

}
