
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface ColumnShowEvent
    extends NativeEvent
{


    Series getSeries();

}
