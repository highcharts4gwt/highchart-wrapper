
package com.github.highcharts4gwt.model.highcharts.option.mock.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.PointUpdateHandler;


/**
 * Properties for each single point
 * 
 */
public class MockPoint
    implements Point
{

    private String genericField;
    private String functionAsString;

    public void addPointClickHandler(PointClickHandler handler) {
    }

    public void addPointMouseOutHandler(PointMouseOutHandler handler) {
    }

    public void addPointMouseOverHandler(PointMouseOverHandler handler) {
    }

    public void addPointRemoveHandler(PointRemoveHandler handler) {
    }

    public void addPointSelectHandler(PointSelectHandler handler) {
    }

    public void addPointUnselectHandler(PointUnselectHandler handler) {
    }

    public void addPointUpdateHandler(PointUpdateHandler handler) {
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
