
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface BarLegendItemClickEvent
    extends NativeEvent
{


    Series getSeries();

}
