
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotMouseOverEvent
    extends NativeEvent
    implements BoxplotMouseOverEvent
{


    protected JsoBoxplotMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
