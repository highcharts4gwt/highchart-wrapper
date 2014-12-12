
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeShowHandler;

public interface Arearange
    extends Area
{


    void addArearangeAfterAnimateHandler(ArearangeAfterAnimateHandler arearangeAfterAnimateHandler);

    void addArearangeCheckboxClickHandler(ArearangeCheckboxClickHandler arearangeCheckboxClickHandler);

    void addArearangeClickHandler(ArearangeClickHandler arearangeClickHandler);

    void addArearangeHideHandler(ArearangeHideHandler arearangeHideHandler);

    void addArearangeLegendItemClickHandler(ArearangeLegendItemClickHandler arearangeLegendItemClickHandler);

    void addArearangeMouseOutHandler(ArearangeMouseOutHandler arearangeMouseOutHandler);

    void addArearangeMouseOverHandler(ArearangeMouseOverHandler arearangeMouseOverHandler);

    void addArearangeShowHandler(ArearangeShowHandler arearangeShowHandler);

}
