
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid.states.hover;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.states.hover.Halo;


/**
 * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
 * 
 */
public class MockHalo
    implements Halo
{

    private String attributes;
    private double opacity;
    private double size;
    private String genericField;
    private String functionAsString;

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

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockHalo setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
