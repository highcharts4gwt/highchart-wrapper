
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeMouseOverEvent
    extends NativeEvent
    implements GaugeMouseOverEvent
{


    protected JsoGaugeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
