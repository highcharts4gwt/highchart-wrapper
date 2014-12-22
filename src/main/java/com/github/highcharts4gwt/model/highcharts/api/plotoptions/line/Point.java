
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
