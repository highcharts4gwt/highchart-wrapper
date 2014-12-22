
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineShowHandler;

public interface Spline
    extends Series
{


    void addSplineAfterAnimateHandler(SplineAfterAnimateHandler splineAfterAnimateHandler);

    void addSplineCheckboxClickHandler(SplineCheckboxClickHandler splineCheckboxClickHandler);

    void addSplineClickHandler(SplineClickHandler splineClickHandler);

    void addSplineHideHandler(SplineHideHandler splineHideHandler);

    void addSplineLegendItemClickHandler(SplineLegendItemClickHandler splineLegendItemClickHandler);

    void addSplineMouseOutHandler(SplineMouseOutHandler splineMouseOutHandler);

    void addSplineMouseOverHandler(SplineMouseOverHandler splineMouseOverHandler);

    void addSplineShowHandler(SplineShowHandler splineShowHandler);

}
