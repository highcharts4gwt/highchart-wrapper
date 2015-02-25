
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Data;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoData
    extends JavaScriptObject
    implements Data
{


    protected JsoData() {
    }

    public final native String csv()
        throws RuntimeException /*-{
        return this["csv"] = (this["csv"] || "");
    }-*/
    ;

    public final native JsoData csv(String csv)
        throws RuntimeException /*-{
        this["csv"] = csv;
        return this;
    }-*/
    ;

    public final native String dateFormat()
        throws RuntimeException /*-{
        return this["dateFormat"] = (this["dateFormat"] || "null");
    }-*/
    ;

    public final native JsoData dateFormat(String dateFormat)
        throws RuntimeException /*-{
        this["dateFormat"] = dateFormat;
        return this;
    }-*/
    ;

    public final native String decimalPoint()
        throws RuntimeException /*-{
        return this["decimalPoint"] = (this["decimalPoint"] || ".");
    }-*/
    ;

    public final native JsoData decimalPoint(String decimalPoint)
        throws RuntimeException /*-{
        this["decimalPoint"] = decimalPoint;
        return this;
    }-*/
    ;

    public final native double endColumn()
        throws RuntimeException /*-{
        return this["endColumn"] = (this["endColumn"] || '');
    }-*/
    ;

    public final native JsoData endColumn(double endColumn)
        throws RuntimeException /*-{
        this["endColumn"] = endColumn;
        return this;
    }-*/
    ;

    public final native double endRow()
        throws RuntimeException /*-{
        return this["endRow"] = (this["endRow"] || '');
    }-*/
    ;

    public final native JsoData endRow(double endRow)
        throws RuntimeException /*-{
        this["endRow"] = endRow;
        return this;
    }-*/
    ;

    public final native boolean firstRowAsNames()
        throws RuntimeException /*-{
        return this["firstRowAsNames"] = (this["firstRowAsNames"] || true);
    }-*/
    ;

    public final native JsoData firstRowAsNames(boolean firstRowAsNames)
        throws RuntimeException /*-{
        this["firstRowAsNames"] = firstRowAsNames;
        return this;
    }-*/
    ;

    public final native String googleSpreadsheetKey()
        throws RuntimeException /*-{
        return this["googleSpreadsheetKey"] = (this["googleSpreadsheetKey"] || "");
    }-*/
    ;

    public final native JsoData googleSpreadsheetKey(String googleSpreadsheetKey)
        throws RuntimeException /*-{
        this["googleSpreadsheetKey"] = googleSpreadsheetKey;
        return this;
    }-*/
    ;

    public final native String googleSpreadsheetWorksheet()
        throws RuntimeException /*-{
        return this["googleSpreadsheetWorksheet"] = (this["googleSpreadsheetWorksheet"] || "null");
    }-*/
    ;

    public final native JsoData googleSpreadsheetWorksheet(String googleSpreadsheetWorksheet)
        throws RuntimeException /*-{
        this["googleSpreadsheetWorksheet"] = googleSpreadsheetWorksheet;
        return this;
    }-*/
    ;

    public final native String itemDelimiter()
        throws RuntimeException /*-{
        return this["itemDelimiter"] = (this["itemDelimiter"] || "");
    }-*/
    ;

    public final native JsoData itemDelimiter(String itemDelimiter)
        throws RuntimeException /*-{
        this["itemDelimiter"] = itemDelimiter;
        return this;
    }-*/
    ;

    public final native String lineDelimiter()
        throws RuntimeException /*-{
        return this["lineDelimiter"] = (this["lineDelimiter"] || "\n");
    }-*/
    ;

    public final native JsoData lineDelimiter(String lineDelimiter)
        throws RuntimeException /*-{
        this["lineDelimiter"] = lineDelimiter;
        return this;
    }-*/
    ;

    public final native String seriesMapping()
        throws RuntimeException /*-{
        this["seriesMapping"] = (this["seriesMapping"] || []);
        return JSON.stringify(this["seriesMapping"]);
    }-*/
    ;

    public final native JsoData seriesMapping(String seriesMappingAsJsonStringArray)
        throws RuntimeException /*-{
        this["seriesMapping"] = JSON.parse(seriesMappingAsJsonStringArray);
        return this;
    }-*/
    ;

    public final native double startColumn()
        throws RuntimeException /*-{
        return this["startColumn"] = (this["startColumn"] || 0.0);
    }-*/
    ;

    public final native JsoData startColumn(double startColumn)
        throws RuntimeException /*-{
        this["startColumn"] = startColumn;
        return this;
    }-*/
    ;

    public final native double startRow()
        throws RuntimeException /*-{
        return this["startRow"] = (this["startRow"] || 0.0);
    }-*/
    ;

    public final native JsoData startRow(double startRow)
        throws RuntimeException /*-{
        this["startRow"] = startRow;
        return this;
    }-*/
    ;

    public final native boolean switchRowsAndColumns()
        throws RuntimeException /*-{
        return this["switchRowsAndColumns"] = (this["switchRowsAndColumns"] || false);
    }-*/
    ;

    public final native JsoData switchRowsAndColumns(boolean switchRowsAndColumns)
        throws RuntimeException /*-{
        this["switchRowsAndColumns"] = switchRowsAndColumns;
        return this;
    }-*/
    ;

    public final native String table()
        throws RuntimeException /*-{
        return this["table"] = (this["table"] || "");
    }-*/
    ;

    public final native JsoData table(String table)
        throws RuntimeException /*-{
        this["table"] = table;
        return this;
    }-*/
    ;

}
