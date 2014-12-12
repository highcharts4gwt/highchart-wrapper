
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineShowHandler;

public interface Areaspline
    extends Area
{


    void addAreasplineAfterAnimateHandler(AreasplineAfterAnimateHandler areasplineAfterAnimateHandler);

    void addAreasplineCheckboxClickHandler(AreasplineCheckboxClickHandler areasplineCheckboxClickHandler);

    void addAreasplineClickHandler(AreasplineClickHandler areasplineClickHandler);

    void addAreasplineHideHandler(AreasplineHideHandler areasplineHideHandler);

    void addAreasplineLegendItemClickHandler(AreasplineLegendItemClickHandler areasplineLegendItemClickHandler);

    void addAreasplineMouseOutHandler(AreasplineMouseOutHandler areasplineMouseOutHandler);

    void addAreasplineMouseOverHandler(AreasplineMouseOverHandler areasplineMouseOverHandler);

    void addAreasplineShowHandler(AreasplineShowHandler areasplineShowHandler);

}
