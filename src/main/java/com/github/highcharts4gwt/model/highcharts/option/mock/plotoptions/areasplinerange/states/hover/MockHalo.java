
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areasplinerange.states.hover;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.states.hover.Halo;

public class MockHalo
    implements Halo
{

    private String attributes;
    private double opacity;
    private double size;
    private String genericField;

    public String attributes() {
        return attributes;
    }

    public MockHalo attributes(String attributesAsJsonString) {
        this.attributes = attributesAsJsonString;
        return this;
    }

    public double opacity() {
        return opacity;
    }

    public MockHalo opacity(double opacity) {
        this.opacity = opacity;
        return this;
    }

    public double size() {
        return size;
    }

    public MockHalo size(double size) {
        this.size = size;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockHalo setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
