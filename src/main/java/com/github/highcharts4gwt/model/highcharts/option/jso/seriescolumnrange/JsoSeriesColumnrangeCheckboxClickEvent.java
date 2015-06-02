
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeCheckboxClickEvent
    extends NativeEvent
    implements SeriesColumnrangeCheckboxClickEvent
{


    protected JsoSeriesColumnrangeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
