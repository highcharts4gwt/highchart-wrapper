
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarClickEvent
    extends NativeEvent
    implements BarClickEvent
{


    protected JsoBarClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
