
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area.AreaShowHandler;

public interface Area
    extends Series
{


    void addAreaAfterAnimateHandler(AreaAfterAnimateHandler areaAfterAnimateHandler);

    void addAreaCheckboxClickHandler(AreaCheckboxClickHandler areaCheckboxClickHandler);

    void addAreaClickHandler(AreaClickHandler areaClickHandler);

    void addAreaHideHandler(AreaHideHandler areaHideHandler);

    void addAreaLegendItemClickHandler(AreaLegendItemClickHandler areaLegendItemClickHandler);

    void addAreaMouseOutHandler(AreaMouseOutHandler areaMouseOutHandler);

    void addAreaMouseOverHandler(AreaMouseOverHandler areaMouseOverHandler);

    void addAreaShowHandler(AreaShowHandler areaShowHandler);

    String fillColor();

    Area fillColor(String fillColor);

    double fillOpacity();

    Area fillOpacity(double fillOpacity);

    String lineColor();

    Area lineColor(String lineColor);

    String negativeFillColor();

    Area negativeFillColor(String negativeFillColor);

    String step();

    Area step(String step);

    boolean trackByArea();

    Area trackByArea(boolean trackByArea);

}
