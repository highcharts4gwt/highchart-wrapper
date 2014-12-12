
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointRemoveHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointSelectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointUnselectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
