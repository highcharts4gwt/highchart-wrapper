
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface BoxplotAfterAnimateEvent
    extends NativeEvent
{


    Series getSeries();

}