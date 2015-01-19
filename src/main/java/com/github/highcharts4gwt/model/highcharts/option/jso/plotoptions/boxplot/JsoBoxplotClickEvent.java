
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotClickEvent
    extends NativeEvent
    implements BoxplotClickEvent
{


    protected JsoBoxplotClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
