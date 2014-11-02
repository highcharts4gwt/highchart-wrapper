
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;

public interface Waterfall
    extends Column
{


    String lineColor();

    Waterfall lineColor(String lineColor);

    String upColor();

    Waterfall upColor(String upColor);

}
