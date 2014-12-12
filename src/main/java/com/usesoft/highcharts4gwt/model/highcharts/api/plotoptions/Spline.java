
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineShowHandler;

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
