
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface ErrorbarAfterAnimateEvent
    extends NativeEvent
{


    Series getSeries();

}