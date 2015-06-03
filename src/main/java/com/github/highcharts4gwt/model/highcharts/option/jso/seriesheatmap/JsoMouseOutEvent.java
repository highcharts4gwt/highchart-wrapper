
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.MouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoMouseOutEvent
    extends NativeEvent
    implements MouseOutEvent
{


    protected JsoMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
