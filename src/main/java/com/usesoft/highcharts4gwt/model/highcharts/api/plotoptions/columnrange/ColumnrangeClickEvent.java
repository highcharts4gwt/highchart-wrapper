
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface ColumnrangeClickEvent
    extends NativeEvent
{


    Series getSeries();

}