
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Arearange;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeShowHandler;

public interface Areasplinerange
    extends Arearange
{


    void addAreasplinerangeAfterAnimateHandler(AreasplinerangeAfterAnimateHandler areasplinerangeAfterAnimateHandler);

    void addAreasplinerangeCheckboxClickHandler(AreasplinerangeCheckboxClickHandler areasplinerangeCheckboxClickHandler);

    void addAreasplinerangeClickHandler(AreasplinerangeClickHandler areasplinerangeClickHandler);

    void addAreasplinerangeHideHandler(AreasplinerangeHideHandler areasplinerangeHideHandler);

    void addAreasplinerangeLegendItemClickHandler(AreasplinerangeLegendItemClickHandler areasplinerangeLegendItemClickHandler);

    void addAreasplinerangeMouseOutHandler(AreasplinerangeMouseOutHandler areasplinerangeMouseOutHandler);

    void addAreasplinerangeMouseOverHandler(AreasplinerangeMouseOverHandler areasplinerangeMouseOverHandler);

    void addAreasplinerangeShowHandler(AreasplinerangeShowHandler areasplinerangeShowHandler);

}
