
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterMouseOverEvent
    extends NativeEvent
    implements ScatterMouseOverEvent
{


    protected JsoScatterMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
