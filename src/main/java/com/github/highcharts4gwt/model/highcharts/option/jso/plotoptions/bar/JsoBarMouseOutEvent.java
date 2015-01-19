
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarMouseOutEvent
    extends NativeEvent
    implements BarMouseOutEvent
{


    protected JsoBarMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
