
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface ScatterLegendItemClickEvent
    extends NativeEvent
{


    Series getSeries();

}