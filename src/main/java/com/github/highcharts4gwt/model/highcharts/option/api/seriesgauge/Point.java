
package com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.PointUpdateHandler;


/**
 * Properties for each single point
 * 
 */
public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

    String getFieldAsJsonObject(String fieldName);

    Point setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Point setFunctionAsString(String fieldName, String functionAsString);

}
