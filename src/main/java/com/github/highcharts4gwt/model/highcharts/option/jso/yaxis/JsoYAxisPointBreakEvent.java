
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisPointBreakEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoYAxisPointBreakEvent
    extends NativeEvent
    implements YAxisPointBreakEvent
{


    protected JsoYAxisPointBreakEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
