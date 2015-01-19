
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterClickEvent
    extends NativeEvent
    implements ScatterClickEvent
{


    protected JsoScatterClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
