
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotMouseOutEvent
    extends NativeEvent
    implements BoxplotMouseOutEvent
{


    protected JsoBoxplotMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
