
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface WaterfallLegendItemClickEvent
    extends NativeEvent
{


    Series getSeries();

}