
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
