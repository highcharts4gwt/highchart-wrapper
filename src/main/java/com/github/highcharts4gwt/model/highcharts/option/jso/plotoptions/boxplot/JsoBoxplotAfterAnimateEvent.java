
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotAfterAnimateEvent
    extends NativeEvent
    implements BoxplotAfterAnimateEvent
{


    protected JsoBoxplotAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
