
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineCheckboxClickEvent
    extends NativeEvent
    implements SeriesAreasplineCheckboxClickEvent
{


    protected JsoSeriesAreasplineCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
