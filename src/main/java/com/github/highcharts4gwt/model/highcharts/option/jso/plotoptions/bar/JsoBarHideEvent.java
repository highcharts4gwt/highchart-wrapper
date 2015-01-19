
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarHideEvent
    extends NativeEvent
    implements BarHideEvent
{


    protected JsoBarHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
