
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
