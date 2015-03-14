
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayString;


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
public interface Lang {


    /**
     * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
     * 
     */
    String contextButtonTitle();

    /**
     * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
     * 
     */
    Lang contextButtonTitle(String contextButtonTitle);

    /**
     * The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
     * 
     */
    String decimalPoint();

    /**
     * The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
     * 
     */
    Lang decimalPoint(String decimalPoint);

    /**
     * Exporting module only. The text for the JPEG download menu item.
     * 
     */
    String downloadJPEG();

    /**
     * Exporting module only. The text for the JPEG download menu item.
     * 
     */
    Lang downloadJPEG(String downloadJPEG);

    /**
     * Exporting module only. The text for the PDF download menu item.
     * 
     */
    String downloadPDF();

    /**
     * Exporting module only. The text for the PDF download menu item.
     * 
     */
    Lang downloadPDF(String downloadPDF);

    /**
     * Exporting module only. The text for the PNG download menu item.
     * 
     */
    String downloadPNG();

    /**
     * Exporting module only. The text for the PNG download menu item.
     * 
     */
    Lang downloadPNG(String downloadPNG);

    /**
     * Exporting module only. The text for the SVG download menu item.
     * 
     */
    String downloadSVG();

    /**
     * Exporting module only. The text for the SVG download menu item.
     * 
     */
    Lang downloadSVG(String downloadSVG);

    /**
     * The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
     * 
     */
    String drillUpText();

    /**
     * The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
     * 
     */
    Lang drillUpText(String drillUpText);

    /**
     * The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
     * 
     */
    String loading();

    /**
     * The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
     * 
     */
    Lang loading(String loading);

    /**
     * An array containing the months names. Corresponds to the  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
     * 
     */
    ArrayString months();

    /**
     * An array containing the months names. Corresponds to the  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
     * 
     */
    Lang months(ArrayString months);

    /**
     * The text to display when the chart contains no data. Requires the no-data module, see <a href="#noData">noData</a>.
     * 
     */
    String noData();

    /**
     * The text to display when the chart contains no data. Requires the no-data module, see <a href="#noData">noData</a>.
     * 
     */
    Lang noData(String noData);

    /**
     * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
     * 
     */
    ArrayString numericSymbols();

    /**
     * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
     * 
     */
    Lang numericSymbols(ArrayString numericSymbols);

    /**
     * Exporting module only. The text for the menu item to print the chart.
     * 
     */
    String printChart();

    /**
     * Exporting module only. The text for the menu item to print the chart.
     * 
     */
    Lang printChart(String printChart);

    /**
     * The text for the label appearing when a chart is zoomed.
     * 
     */
    String resetZoom();

    /**
     * The text for the label appearing when a chart is zoomed.
     * 
     */
    Lang resetZoom(String resetZoom);

    /**
     * The tooltip title for the label appearing when a chart is zoomed.
     * 
     */
    String resetZoomTitle();

    /**
     * The tooltip title for the label appearing when a chart is zoomed.
     * 
     */
    Lang resetZoomTitle(String resetZoomTitle);

    /**
     * An array containing the months names in abbreviated form. Corresponds to the  <code>%b</code> format in <code>Highcharts.dateFormat()</code>.
     * 
     */
    ArrayString shortMonths();

    /**
     * An array containing the months names in abbreviated form. Corresponds to the  <code>%b</code> format in <code>Highcharts.dateFormat()</code>.
     * 
     */
    Lang shortMonths(ArrayString shortMonths);

    /**
     * The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
     * 
     */
    String thousandsSep();

    /**
     * The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
     * 
     */
    Lang thousandsSep(String thousandsSep);

    /**
     * An array containing the weekday names.
     * 
     */
    ArrayString weekdays();

    /**
     * An array containing the weekday names.
     * 
     */
    Lang weekdays(ArrayString weekdays);

    String getFieldAsJsonObject(String fieldName);

    Lang setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Lang setFunctionAsString(String fieldName, String functionAsString);

}
