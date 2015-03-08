
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Pane;


/**
 * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
 * 
 */
public class MockPane
    implements Pane
{

    private String background;
    private ArrayString centerAsArrayString;
    private ArrayNumber centerAsArrayNumber;
    private double endAngle;
    private double sizeAsNumber;
    private String sizeAsString;
    private double startAngle;
    private String genericField;

    public String background() {
        return background;
    }

    public MockPane background(String backgroundAsJsonStringArray) {
        this.background = backgroundAsJsonStringArray;
        return this;
    }

    public ArrayString centerAsArrayString() {
        return centerAsArrayString;
    }

    public MockPane centerAsArrayString(ArrayString centerAsArrayString) {
        this.centerAsArrayString = centerAsArrayString;
        return this;
    }

    public ArrayNumber centerAsArrayNumber() {
        return centerAsArrayNumber;
    }

    public MockPane centerAsArrayNumber(ArrayNumber centerAsArrayNumber) {
        this.centerAsArrayNumber = centerAsArrayNumber;
        return this;
    }

    public double endAngle() {
        return endAngle;
    }

    public MockPane endAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public double sizeAsNumber() {
        return sizeAsNumber;
    }

    public MockPane sizeAsNumber(double sizeAsNumber) {
        this.sizeAsNumber = sizeAsNumber;
        return this;
    }

    public String sizeAsString() {
        return sizeAsString;
    }

    public MockPane sizeAsString(String sizeAsString) {
        this.sizeAsString = sizeAsString;
        return this;
    }

    public double startAngle() {
        return startAngle;
    }

    public MockPane startAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPane setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
