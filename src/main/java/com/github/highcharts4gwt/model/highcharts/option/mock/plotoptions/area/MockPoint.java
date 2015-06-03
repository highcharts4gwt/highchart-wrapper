
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.UpdateHandler;


/**
 * Properties for each single point
 * 
 */
public class MockPoint
    implements Point
{

    private String genericField;
    private String functionAsString;

    public void addClickHandler(ClickHandler handler) {
    }

    public void addMouseOutHandler(MouseOutHandler handler) {
    }

    public void addMouseOverHandler(MouseOverHandler handler) {
    }

    public void addRemoveHandler(RemoveHandler handler) {
    }

    public void addSelectHandler(SelectHandler handler) {
    }

    public void addUnselectHandler(UnselectHandler handler) {
    }

    public void addUpdateHandler(UpdateHandler handler) {
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPoint setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockPoint setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
