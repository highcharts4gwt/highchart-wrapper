
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line;

import com.usesoft.highcharts4gwt.model.event.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;

public interface LineCheckboxClickEvent
    extends NativeEvent
{


    Series getSeries();

}
