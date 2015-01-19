
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisSetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoYAxisSetExtremesEvent
    extends NativeEvent
    implements YAxisSetExtremesEvent
{


    protected JsoYAxisSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
