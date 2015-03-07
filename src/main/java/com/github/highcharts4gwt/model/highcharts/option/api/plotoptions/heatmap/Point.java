
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.point.PointUpdateHandler;

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
