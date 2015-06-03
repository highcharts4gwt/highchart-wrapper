
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.point.UpdateHandler;


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
