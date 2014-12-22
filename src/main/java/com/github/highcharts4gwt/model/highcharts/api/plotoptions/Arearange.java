
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeShowHandler;

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
