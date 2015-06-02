
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnCheckboxClickEvent
    extends NativeEvent
    implements SeriesColumnCheckboxClickEvent
{


    protected JsoSeriesColumnCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
