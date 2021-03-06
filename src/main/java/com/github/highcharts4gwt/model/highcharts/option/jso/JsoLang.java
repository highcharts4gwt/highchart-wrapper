
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Lang;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Language object. The language object is global and it can't
 * 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to
 * 		set it before any chart is initiated. 
 * <pre>Highcharts.setOptions({
 * 	lang: {
 * 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
 * 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']
 * 	}
 * });</pre>
 * 
 */
public class JsoLang
    extends JavaScriptObject
    implements Lang
{


    protected JsoLang() {
    }

    public final native String contextButtonTitle()
        throws RuntimeException /*-{
        return this["contextButtonTitle"] = (this["contextButtonTitle"] || "Chart context menu");
    }-*/
    ;

    public final native JsoLang contextButtonTitle(String contextButtonTitle)
        throws RuntimeException /*-{
        this["contextButtonTitle"] = contextButtonTitle;
        return this;
    }-*/
    ;

    public final native String decimalPoint()
        throws RuntimeException /*-{
        return this["decimalPoint"] = (this["decimalPoint"] || ".");
    }-*/
    ;

    public final native JsoLang decimalPoint(String decimalPoint)
        throws RuntimeException /*-{
        this["decimalPoint"] = decimalPoint;
        return this;
    }-*/
    ;

    public final native String downloadJPEG()
        throws RuntimeException /*-{
        return this["downloadJPEG"] = (this["downloadJPEG"] || "Download JPEG image");
    }-*/
    ;

    public final native JsoLang downloadJPEG(String downloadJPEG)
        throws RuntimeException /*-{
        this["downloadJPEG"] = downloadJPEG;
        return this;
    }-*/
    ;

    public final native String downloadPDF()
        throws RuntimeException /*-{
        return this["downloadPDF"] = (this["downloadPDF"] || "Download PDF document");
    }-*/
    ;

    public final native JsoLang downloadPDF(String downloadPDF)
        throws RuntimeException /*-{
        this["downloadPDF"] = downloadPDF;
        return this;
    }-*/
    ;

    public final native String downloadPNG()
        throws RuntimeException /*-{
        return this["downloadPNG"] = (this["downloadPNG"] || "Download PNG image");
    }-*/
    ;

    public final native JsoLang downloadPNG(String downloadPNG)
        throws RuntimeException /*-{
        this["downloadPNG"] = downloadPNG;
        return this;
    }-*/
    ;

    public final native String downloadSVG()
        throws RuntimeException /*-{
        return this["downloadSVG"] = (this["downloadSVG"] || "Download SVG vector image");
    }-*/
    ;

    public final native JsoLang downloadSVG(String downloadSVG)
        throws RuntimeException /*-{
        this["downloadSVG"] = downloadSVG;
        return this;
    }-*/
    ;

    public final native String drillUpText()
        throws RuntimeException /*-{
        return this["drillUpText"] = (this["drillUpText"] || "Back to {series.name}");
    }-*/
    ;

    public final native JsoLang drillUpText(String drillUpText)
        throws RuntimeException /*-{
        this["drillUpText"] = drillUpText;
        return this;
    }-*/
    ;

    public final native String loading()
        throws RuntimeException /*-{
        return this["loading"] = (this["loading"] || "Loading...");
    }-*/
    ;

    public final native JsoLang loading(String loading)
        throws RuntimeException /*-{
        this["loading"] = loading;
        return this;
    }-*/
    ;

    public final native ArrayString months()
        throws RuntimeException /*-{
        return this["months"] = (this["months"] || [ "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"]);
    }-*/
    ;

    public final native JsoLang months(ArrayString months)
        throws RuntimeException /*-{
        this["months"] = months;
        return this;
    }-*/
    ;

    public final native String noData()
        throws RuntimeException /*-{
        return this["noData"] = (this["noData"] || "No data to display");
    }-*/
    ;

    public final native JsoLang noData(String noData)
        throws RuntimeException /*-{
        this["noData"] = noData;
        return this;
    }-*/
    ;

    public final native ArrayString numericSymbols()
        throws RuntimeException /*-{
        return this["numericSymbols"] = (this["numericSymbols"] || [ "k" , "M" , "G" , "T" , "P" , "E"]);
    }-*/
    ;

    public final native JsoLang numericSymbols(ArrayString numericSymbols)
        throws RuntimeException /*-{
        this["numericSymbols"] = numericSymbols;
        return this;
    }-*/
    ;

    public final native String printChart()
        throws RuntimeException /*-{
        return this["printChart"] = (this["printChart"] || "Print chart");
    }-*/
    ;

    public final native JsoLang printChart(String printChart)
        throws RuntimeException /*-{
        this["printChart"] = printChart;
        return this;
    }-*/
    ;

    public final native String resetZoom()
        throws RuntimeException /*-{
        return this["resetZoom"] = (this["resetZoom"] || "Reset zoom");
    }-*/
    ;

    public final native JsoLang resetZoom(String resetZoom)
        throws RuntimeException /*-{
        this["resetZoom"] = resetZoom;
        return this;
    }-*/
    ;

    public final native String resetZoomTitle()
        throws RuntimeException /*-{
        return this["resetZoomTitle"] = (this["resetZoomTitle"] || "Reset zoom level 1:1");
    }-*/
    ;

    public final native JsoLang resetZoomTitle(String resetZoomTitle)
        throws RuntimeException /*-{
        this["resetZoomTitle"] = resetZoomTitle;
        return this;
    }-*/
    ;

    public final native ArrayString shortMonths()
        throws RuntimeException /*-{
        return this["shortMonths"] = (this["shortMonths"] || [ "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"]);
    }-*/
    ;

    public final native JsoLang shortMonths(ArrayString shortMonths)
        throws RuntimeException /*-{
        this["shortMonths"] = shortMonths;
        return this;
    }-*/
    ;

    public final native String thousandsSep()
        throws RuntimeException /*-{
        return this["thousandsSep"] = (this["thousandsSep"] || "");
    }-*/
    ;

    public final native JsoLang thousandsSep(String thousandsSep)
        throws RuntimeException /*-{
        this["thousandsSep"] = thousandsSep;
        return this;
    }-*/
    ;

    public final native ArrayString weekdays()
        throws RuntimeException /*-{
        return this["weekdays"] = (this["weekdays"] || ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]);
    }-*/
    ;

    public final native JsoLang weekdays(ArrayString weekdays)
        throws RuntimeException /*-{
        this["weekdays"] = weekdays;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoLang setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoLang setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
