
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.states.Hover;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoStates
    extends JavaScriptObject
    implements States
{


    protected JsoStates() {
    }

    public final native Hover hover()
        throws RuntimeException /*-{
        return this["hover"] = (this["hover"] || {});
    }-*/
    ;

    public final native JsoStates hover(Hover hover)
        throws RuntimeException /*-{
        this["hover"] = hover;
        return this;
    }-*/
    ;

}
