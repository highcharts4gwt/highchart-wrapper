
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoTreemapShowEvent
    extends NativeEvent
    implements TreemapShowEvent
{


    protected JsoTreemapShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
