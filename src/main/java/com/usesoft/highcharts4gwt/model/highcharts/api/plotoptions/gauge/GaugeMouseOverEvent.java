
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface GaugeMouseOverEvent
    extends NativeEvent
{


    Series getSeries();

}
