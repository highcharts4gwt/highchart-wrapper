
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterHideEvent
    extends NativeEvent
    implements ScatterHideEvent
{


    protected JsoScatterHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
