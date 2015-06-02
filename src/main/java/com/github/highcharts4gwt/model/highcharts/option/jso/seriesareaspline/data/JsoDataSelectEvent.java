
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.data.DataSelectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataSelectEvent
    extends NativeEvent
    implements DataSelectEvent
{


    protected JsoDataSelectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
