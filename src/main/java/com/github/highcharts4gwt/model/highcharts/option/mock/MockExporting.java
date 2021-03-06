
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;


/**
 * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
 * 
 */
public class MockExporting
    implements Exporting
{

    private Buttons buttons;
    private String chartOptions;
    private boolean enabled;
    private String filename;
    private String formAttributes;
    private double scale;
    private double sourceHeight;
    private double sourceWidth;
    private String type;
    private String url;
    private double width;
    private String genericField;
    private String functionAsString;

    public Buttons buttons() {
        return buttons;
    }

    public MockExporting buttons(Buttons buttons) {
        this.buttons = buttons;
        return this;
    }

    public String chartOptions() {
        return chartOptions;
    }

    public MockExporting chartOptions(String chartOptionsAsJsonString) {
        this.chartOptions = chartOptionsAsJsonString;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockExporting enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String filename() {
        return filename;
    }

    public MockExporting filename(String filename) {
        this.filename = filename;
        return this;
    }

    public String formAttributes() {
        return formAttributes;
    }

    public MockExporting formAttributes(String formAttributesAsJsonString) {
        this.formAttributes = formAttributesAsJsonString;
        return this;
    }

    public double scale() {
        return scale;
    }

    public MockExporting scale(double scale) {
        this.scale = scale;
        return this;
    }

    public double sourceHeight() {
        return sourceHeight;
    }

    public MockExporting sourceHeight(double sourceHeight) {
        this.sourceHeight = sourceHeight;
        return this;
    }

    public double sourceWidth() {
        return sourceWidth;
    }

    public MockExporting sourceWidth(double sourceWidth) {
        this.sourceWidth = sourceWidth;
        return this;
    }

    public String type() {
        return type;
    }

    public MockExporting type(String type) {
        this.type = type;
        return this;
    }

    public String url() {
        return url;
    }

    public MockExporting url(String url) {
        this.url = url;
        return this;
    }

    public double width() {
        return width;
    }

    public MockExporting width(double width) {
        this.width = width;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockExporting setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockExporting setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
