
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.point.PointUpdateHandler;

public class MockPoint
    implements Point
{

    private String genericField;

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

}
