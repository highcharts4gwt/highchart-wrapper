
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.data.DataUnselectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataUnselectEvent
    extends NativeEvent
    implements DataUnselectEvent
{


    protected JsoDataUnselectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
