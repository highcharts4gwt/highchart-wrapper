
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface SolidgaugeLegendItemClickEvent
    extends NativeEvent
{


    Series getSeries();

}
