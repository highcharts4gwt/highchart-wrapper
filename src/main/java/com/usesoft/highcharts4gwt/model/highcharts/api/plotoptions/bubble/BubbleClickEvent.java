
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface BubbleClickEvent
    extends NativeEvent
{


    Series getSeries();

}
