
package com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.point.PointUpdateHandler;


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
