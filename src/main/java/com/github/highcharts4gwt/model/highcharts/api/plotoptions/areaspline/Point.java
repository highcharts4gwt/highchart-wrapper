
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}
