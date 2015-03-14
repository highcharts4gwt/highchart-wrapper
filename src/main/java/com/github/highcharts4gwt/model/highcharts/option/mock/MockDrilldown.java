
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;


/**
 * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
 * 
 * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
 * 
 */
public class MockDrilldown
    implements Drilldown
{

    private String activeAxisLabelStyle;
    private String activeDataLabelStyle;
    private boolean animationAsBoolean;
    private String animationAsJsonString;
    private DrillUpButton drillUpButton;
    private String genericField;
    private String functionAsString;

    public String activeAxisLabelStyle() {
        return activeAxisLabelStyle;
    }

    public MockDrilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString) {
        this.activeAxisLabelStyle = activeAxisLabelStyleAsJsonString;
        return this;
    }

    public String activeDataLabelStyle() {
        return activeDataLabelStyle;
    }

    public MockDrilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString) {
        this.activeDataLabelStyle = activeDataLabelStyleAsJsonString;
        return this;
    }

    public boolean animationAsBoolean() {
        return animationAsBoolean;
    }

    public MockDrilldown animationAsBoolean(boolean animationAsBoolean) {
        this.animationAsBoolean = animationAsBoolean;
        return this;
    }

    public String animationAsJsonString() {
        return animationAsJsonString;
    }

    public MockDrilldown animationAsJsonString(String animationAsJsonString) {
        this.animationAsJsonString = animationAsJsonString;
        return this;
    }

    public DrillUpButton drillUpButton() {
        return drillUpButton;
    }

    public MockDrilldown drillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockDrilldown setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockDrilldown setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
