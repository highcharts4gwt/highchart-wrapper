
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointUpdateHandler;

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
