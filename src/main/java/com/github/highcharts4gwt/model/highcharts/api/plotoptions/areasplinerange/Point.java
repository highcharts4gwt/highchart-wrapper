
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
