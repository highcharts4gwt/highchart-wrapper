
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Global;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Global options that don't apply to each chart. These options, like the <code>lang</code>
 * 		options, must be set using the <code>Highcharts.setOptions</code> method.
 * <pre>Highcharts.setOptions({
 * 	global: {
 * 		useUTC: false
 * 	}
 * });</pre>
 * 
 */
public class JsoGlobal
    extends JavaScriptObject
    implements Global
{


    protected JsoGlobal() {
    }

    public final native String Date()
        throws RuntimeException /*-{
        this["Date"] = (this["Date"] || {});
        return JSON.stringify(this["Date"]);
    }-*/
    ;

    public final native JsoGlobal Date(String DateAsJsonString)
        throws RuntimeException /*-{
        this["Date"] = JSON.parse(DateAsJsonString);
        return this;
    }-*/
    ;

    public final native String VMLRadialGradientURL()
        throws RuntimeException /*-{
        return this["VMLRadialGradientURL"] = (this["VMLRadialGradientURL"] || "http://code.highcharts.com/{version}/gfx/vml-radial-gradient.png");
    }-*/
    ;

    public final native JsoGlobal VMLRadialGradientURL(String VMLRadialGradientURL)
        throws RuntimeException /*-{
        this["VMLRadialGradientURL"] = VMLRadialGradientURL;
        return this;
    }-*/
    ;

    public final native String canvasToolsURL()
        throws RuntimeException /*-{
        return this["canvasToolsURL"] = (this["canvasToolsURL"] || "http://code.highcharts.com/{version}/modules/canvas-tools.js");
    }-*/
    ;

    public final native JsoGlobal canvasToolsURL(String canvasToolsURL)
        throws RuntimeException /*-{
        this["canvasToolsURL"] = canvasToolsURL;
        return this;
    }-*/
    ;

    public final native double timezoneOffset()
        throws RuntimeException /*-{
        return this["timezoneOffset"] = (this["timezoneOffset"] || 0.0);
    }-*/
    ;

    public final native JsoGlobal timezoneOffset(double timezoneOffset)
        throws RuntimeException /*-{
        this["timezoneOffset"] = timezoneOffset;
        return this;
    }-*/
    ;

    public final native boolean useUTC()
        throws RuntimeException /*-{
        return this["useUTC"] = (this["useUTC"] || true);
    }-*/
    ;

    public final native JsoGlobal useUTC(boolean useUTC)
        throws RuntimeException /*-{
        this["useUTC"] = useUTC;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoGlobal setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
