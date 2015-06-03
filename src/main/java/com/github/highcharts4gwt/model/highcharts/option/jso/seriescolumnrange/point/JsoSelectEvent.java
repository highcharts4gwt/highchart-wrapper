
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.point.SelectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSelectEvent
    extends NativeEvent
    implements SelectEvent
{


    protected JsoSelectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
