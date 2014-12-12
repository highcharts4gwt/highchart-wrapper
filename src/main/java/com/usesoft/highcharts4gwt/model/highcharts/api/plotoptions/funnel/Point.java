
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointRemoveHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointSelectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointUnselectHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
