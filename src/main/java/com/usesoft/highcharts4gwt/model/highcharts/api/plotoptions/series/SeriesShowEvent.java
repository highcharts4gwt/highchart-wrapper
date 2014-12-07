
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface SeriesShowEvent
    extends NativeEvent
{


    Series getSeries();

}
