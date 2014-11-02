
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;

public interface Area
    extends Series
{


    String fillColor();

    Area fillColor(String fillColor);

    Number fillOpacity();

    Area fillOpacity(Number fillOpacity);

    String lineColor();

    Area lineColor(String lineColor);

    String negativeFillColor();

    Area negativeFillColor(String negativeFillColor);

    boolean trackByArea();

    Area trackByArea(boolean trackByArea);

}
