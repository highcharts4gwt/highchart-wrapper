
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.CompleteCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.ParseDateCallback;
import com.github.highcharts4gwt.model.highcharts.option.api.ParsedCallback;


/**
 * <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
 * 
 * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
 * 
 * <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
 * 
 */
public interface Data {


    /**
     * The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed. The first argument passed is a finished chart options object, containing the series. These options can be extended with additional options and passed directly to the chart constructor.
     * 
     */
    Data complete(CompleteCallback complete);

    /**
     * A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a> and <a href="#data.endColumn">endColumn</a> to delimit what part of the table is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.
     * 
     */
    String csv();

    /**
     * A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a> and <a href="#data.endColumn">endColumn</a> to delimit what part of the table is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.
     * 
     */
    Data csv(String csv);

    /**
     * <p>Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a best guess based on what format gives valid and ordered dates.</p>
     * 
     * <p>Valid options include:
     * <ul>
     * <li><code>YYYY-mm-dd</code></li>
     * <li><code>dd/mm/YYYY</code></li>
     * <li><code>mm/dd/YYYY</code></li>
     * <li><code>dd/mm/YY</code></li>
     * <li><code>mm/dd/YY</code></li>
     * </ul>
     * </p>
     * 
     */
    String dateFormat();

    /**
     * <p>Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a best guess based on what format gives valid and ordered dates.</p>
     * 
     * <p>Valid options include:
     * <ul>
     * <li><code>YYYY-mm-dd</code></li>
     * <li><code>dd/mm/YYYY</code></li>
     * <li><code>mm/dd/YYYY</code></li>
     * <li><code>dd/mm/YY</code></li>
     * <li><code>mm/dd/YY</code></li>
     * </ul>
     * </p>
     * 
     */
    Data dateFormat(String dateFormat);

    /**
     * The decimal point used for parsing numbers in the CSV.
     * 
     */
    String decimalPoint();

    /**
     * The decimal point used for parsing numbers in the CSV.
     * 
     */
    Data decimalPoint(String decimalPoint);

    /**
     * In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
     * 
     */
    double endColumn();

    /**
     * In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
     * 
     */
    Data endColumn(double endColumn);

    /**
     * In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
     * 
     */
    double endRow();

    /**
     * In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
     * 
     */
    Data endRow(double endRow);

    /**
     * Whether to use the first row in the data set as series names.
     * 
     */
    boolean firstRowAsNames();

    /**
     * Whether to use the first row in the data set as series names.
     * 
     */
    Data firstRowAsNames(boolean firstRowAsNames);

    /**
     * The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information on GS</a>.
     * 
     */
    String googleSpreadsheetKey();

    /**
     * The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information on GS</a>.
     * 
     */
    Data googleSpreadsheetKey(String googleSpreadsheetKey);

    /**
     * The Google Spreadsheet worksheet to use in combination with <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id's from your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>
     * 
     */
    String googleSpreadsheetWorksheet();

    /**
     * The Google Spreadsheet worksheet to use in combination with <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id's from your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>
     * 
     */
    Data googleSpreadsheetWorksheet(String googleSpreadsheetWorksheet);

    /**
     * Item or cell delimiter for parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is found in the CSV string, if not it defaults to <code>,</code>.
     * 
     */
    String itemDelimiter();

    /**
     * Item or cell delimiter for parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is found in the CSV string, if not it defaults to <code>,</code>.
     * 
     */
    Data itemDelimiter(String itemDelimiter);

    /**
     * Line delimiter for parsing CSV.
     * 
     */
    String lineDelimiter();

    /**
     * Line delimiter for parsing CSV.
     * 
     */
    Data lineDelimiter(String lineDelimiter);

    /**
     * A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer timestamp on success.
     * 
     */
    Data parseDate(ParseDateCallback parseDate);

    /**
     * A callback function to access the parsed columns, the two-dimentional input data array directly, before they are interpreted into series data and categories. Return <code>false</code> to stop completion, or call <code>this.complete()</code> to continue async.
     * 
     */
    Data parsed(ParsedCallback parsed);

    /**
     * An array containing object with Point property names along with what column id the property should be taken from.
     * 
     */
    String seriesMapping();

    /**
     * An array containing object with Point property names along with what column id the property should be taken from.
     * 
     */
    Data seriesMapping(String seriesMappingAsJsonStringArray);

    /**
     * In tabular input data, the first column (indexed by 0) to use.
     * 
     */
    double startColumn();

    /**
     * In tabular input data, the first column (indexed by 0) to use.
     * 
     */
    Data startColumn(double startColumn);

    /**
     * In tabular input data, the first row (indexed by 0) to use.
     * 
     */
    double startRow();

    /**
     * In tabular input data, the first row (indexed by 0) to use.
     * 
     */
    Data startRow(double startRow);

    /**
     * Switch rows and columns of the input data, so that <code>this.columns</code> effectively becomes the rows of the data set, and the rows are interpreted as series.
     * 
     */
    boolean switchRowsAndColumns();

    /**
     * Switch rows and columns of the input data, so that <code>this.columns</code> effectively becomes the rows of the data set, and the rows are interpreted as series.
     * 
     */
    Data switchRowsAndColumns(boolean switchRowsAndColumns);

    /**
     * A HTML table or the id of such to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
     * 
     */
    String table();

    /**
     * A HTML table or the id of such to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
     * 
     */
    Data table(String table);

    String getFieldAsJsonObject(String fieldName);

    Data setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Data setFunctionAsString(String fieldName, String functionAsString);

}
