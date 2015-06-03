
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PointBreakEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointBreakEvent
    extends NativeEvent
    implements PointBreakEvent
{


    protected JsoPointBreakEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
