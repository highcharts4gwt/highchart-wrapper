
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.area;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface AreaLegendItemClickEvent
    extends NativeEvent
{


    Series getSeries();

}
