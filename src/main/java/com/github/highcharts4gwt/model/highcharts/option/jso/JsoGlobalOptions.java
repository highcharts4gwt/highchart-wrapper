
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Global;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Lang;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoGlobalOptions
    extends JavaScriptObject
    implements GlobalOptions
{


    protected JsoGlobalOptions() {
    }

    public final native Global global()
        throws RuntimeException /*-{
        return this["global"] = (this["global"] || {});
    }-*/
    ;

    public final native JsoGlobalOptions global(Global global)
        throws RuntimeException /*-{
        this["global"] = global;
        return this;
    }-*/
    ;

    public final native Lang lang()
        throws RuntimeException /*-{
        return this["lang"] = (this["lang"] || {});
    }-*/
    ;

    public final native JsoGlobalOptions lang(Lang lang)
        throws RuntimeException /*-{
        this["lang"] = lang;
        return this;
    }-*/
    ;

}