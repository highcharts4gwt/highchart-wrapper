
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Data;

public class MockData
    implements Data
{

    private String csv;
    private String dateFormat;
    private String decimalPoint;
    private double endColumn;
    private double endRow;
    private boolean firstRowAsNames;
    private String googleSpreadsheetKey;
    private String googleSpreadsheetWorksheet;
    private String itemDelimiter;
    private String lineDelimiter;
    private String seriesMapping;
    private double startColumn;
    private double startRow;
    private boolean switchRowsAndColumns;
    private String table;

    public String csv() {
        return csv;
    }

    public MockData csv(String csv) {
        this.csv = csv;
        return this;
    }

    public String dateFormat() {
        return dateFormat;
    }

    public MockData dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String decimalPoint() {
        return decimalPoint;
    }

    public MockData decimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public double endColumn() {
        return endColumn;
    }

    public MockData endColumn(double endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    public double endRow() {
        return endRow;
    }

    public MockData endRow(double endRow) {
        this.endRow = endRow;
        return this;
    }

    public boolean firstRowAsNames() {
        return firstRowAsNames;
    }

    public MockData firstRowAsNames(boolean firstRowAsNames) {
        this.firstRowAsNames = firstRowAsNames;
        return this;
    }

    public String googleSpreadsheetKey() {
        return googleSpreadsheetKey;
    }

    public MockData googleSpreadsheetKey(String googleSpreadsheetKey) {
        this.googleSpreadsheetKey = googleSpreadsheetKey;
        return this;
    }

    public String googleSpreadsheetWorksheet() {
        return googleSpreadsheetWorksheet;
    }

    public MockData googleSpreadsheetWorksheet(String googleSpreadsheetWorksheet) {
        this.googleSpreadsheetWorksheet = googleSpreadsheetWorksheet;
        return this;
    }

    public String itemDelimiter() {
        return itemDelimiter;
    }

    public MockData itemDelimiter(String itemDelimiter) {
        this.itemDelimiter = itemDelimiter;
        return this;
    }

    public String lineDelimiter() {
        return lineDelimiter;
    }

    public MockData lineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
        return this;
    }

    public String seriesMapping() {
        return seriesMapping;
    }

    public MockData seriesMapping(String seriesMappingAsJsonStringArray) {
        this.seriesMapping = seriesMappingAsJsonStringArray;
        return this;
    }

    public double startColumn() {
        return startColumn;
    }

    public MockData startColumn(double startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    public double startRow() {
        return startRow;
    }

    public MockData startRow(double startRow) {
        this.startRow = startRow;
        return this;
    }

    public boolean switchRowsAndColumns() {
        return switchRowsAndColumns;
    }

    public MockData switchRowsAndColumns(boolean switchRowsAndColumns) {
        this.switchRowsAndColumns = switchRowsAndColumns;
        return this;
    }

    public String table() {
        return table;
    }

    public MockData table(String table) {
        this.table = table;
        return this;
    }

}
