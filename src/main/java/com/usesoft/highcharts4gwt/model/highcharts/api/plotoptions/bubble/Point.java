
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointRemoveHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointSelectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointUnselectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
