
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.point.PointUpdateHandler;

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

}
