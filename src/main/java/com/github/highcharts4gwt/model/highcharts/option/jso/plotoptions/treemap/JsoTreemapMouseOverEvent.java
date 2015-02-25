
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoTreemapMouseOverEvent
    extends NativeEvent
    implements TreemapMouseOverEvent
{


    protected JsoTreemapMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
