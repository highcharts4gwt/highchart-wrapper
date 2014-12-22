
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
