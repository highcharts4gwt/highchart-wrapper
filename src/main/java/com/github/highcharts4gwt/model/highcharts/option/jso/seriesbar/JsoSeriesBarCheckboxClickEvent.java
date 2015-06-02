
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.SeriesBarCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBarCheckboxClickEvent
    extends NativeEvent
    implements SeriesBarCheckboxClickEvent
{


    protected JsoSeriesBarCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
