
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Lang;


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
public class MockLang
    implements Lang
{

    private String contextButtonTitle;
    private String decimalPoint;
    private String downloadJPEG;
    private String downloadPDF;
    private String downloadPNG;
    private String downloadSVG;
    private String drillUpText;
    private String loading;
    private ArrayString months;
    private String noData;
    private ArrayString numericSymbols;
    private String printChart;
    private String resetZoom;
    private String resetZoomTitle;
    private ArrayString shortMonths;
    private String thousandsSep;
    private ArrayString weekdays;
    private String genericField;
    private String functionAsString;

    public String contextButtonTitle() {
        return contextButtonTitle;
    }

    public MockLang contextButtonTitle(String contextButtonTitle) {
        this.contextButtonTitle = contextButtonTitle;
        return this;
    }

    public String decimalPoint() {
        return decimalPoint;
    }

    public MockLang decimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public String downloadJPEG() {
        return downloadJPEG;
    }

    public MockLang downloadJPEG(String downloadJPEG) {
        this.downloadJPEG = downloadJPEG;
        return this;
    }

    public String downloadPDF() {
        return downloadPDF;
    }

    public MockLang downloadPDF(String downloadPDF) {
        this.downloadPDF = downloadPDF;
        return this;
    }

    public String downloadPNG() {
        return downloadPNG;
    }

    public MockLang downloadPNG(String downloadPNG) {
        this.downloadPNG = downloadPNG;
        return this;
    }

    public String downloadSVG() {
        return downloadSVG;
    }

    public MockLang downloadSVG(String downloadSVG) {
        this.downloadSVG = downloadSVG;
        return this;
    }

    public String drillUpText() {
        return drillUpText;
    }

    public MockLang drillUpText(String drillUpText) {
        this.drillUpText = drillUpText;
        return this;
    }

    public String loading() {
        return loading;
    }

    public MockLang loading(String loading) {
        this.loading = loading;
        return this;
    }

    public ArrayString months() {
        return months;
    }

    public MockLang months(ArrayString months) {
        this.months = months;
        return this;
    }

    public String noData() {
        return noData;
    }

    public MockLang noData(String noData) {
        this.noData = noData;
        return this;
    }

    public ArrayString numericSymbols() {
        return numericSymbols;
    }

    public MockLang numericSymbols(ArrayString numericSymbols) {
        this.numericSymbols = numericSymbols;
        return this;
    }

    public String printChart() {
        return printChart;
    }

    public MockLang printChart(String printChart) {
        this.printChart = printChart;
        return this;
    }

    public String resetZoom() {
        return resetZoom;
    }

    public MockLang resetZoom(String resetZoom) {
        this.resetZoom = resetZoom;
        return this;
    }

    public String resetZoomTitle() {
        return resetZoomTitle;
    }

    public MockLang resetZoomTitle(String resetZoomTitle) {
        this.resetZoomTitle = resetZoomTitle;
        return this;
    }

    public ArrayString shortMonths() {
        return shortMonths;
    }

    public MockLang shortMonths(ArrayString shortMonths) {
        this.shortMonths = shortMonths;
        return this;
    }

    public String thousandsSep() {
        return thousandsSep;
    }

    public MockLang thousandsSep(String thousandsSep) {
        this.thousandsSep = thousandsSep;
        return this;
    }

    public ArrayString weekdays() {
        return weekdays;
    }

    public MockLang weekdays(ArrayString weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLang setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockLang setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
