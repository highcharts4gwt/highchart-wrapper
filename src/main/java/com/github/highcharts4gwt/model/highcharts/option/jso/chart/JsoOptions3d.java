
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.Options3d;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.Frame;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options to render charts in 3 dimensions. This feature requires <code>highcharts-3d.js</code>, found in the download package or online at <a href="http://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.
 * 
 */
public class JsoOptions3d
    extends JavaScriptObject
    implements Options3d
{


    protected JsoOptions3d() {
    }

    public final native double alpha()
        throws RuntimeException /*-{
        return this["alpha"] = (this["alpha"] || 0.0);
    }-*/
    ;

    public final native JsoOptions3d alpha(double alpha)
        throws RuntimeException /*-{
        this["alpha"] = alpha;
        return this;
    }-*/
    ;

    public final native double beta()
        throws RuntimeException /*-{
        return this["beta"] = (this["beta"] || 0.0);
    }-*/
    ;

    public final native JsoOptions3d beta(double beta)
        throws RuntimeException /*-{
        this["beta"] = beta;
        return this;
    }-*/
    ;

    public final native double depth()
        throws RuntimeException /*-{
        return this["depth"] = (this["depth"] || 100.0);
    }-*/
    ;

    public final native JsoOptions3d depth(double depth)
        throws RuntimeException /*-{
        this["depth"] = depth;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || false);
    }-*/
    ;

    public final native JsoOptions3d enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native Frame frame()
        throws RuntimeException /*-{
        return this["frame"] = (this["frame"] || {});
    }-*/
    ;

    public final native JsoOptions3d frame(Frame frame)
        throws RuntimeException /*-{
        this["frame"] = frame;
        return this;
    }-*/
    ;

    public final native double viewDistance()
        throws RuntimeException /*-{
        return this["viewDistance"] = (this["viewDistance"] || 100.0);
    }-*/
    ;

    public final native JsoOptions3d viewDistance(double viewDistance)
        throws RuntimeException /*-{
        this["viewDistance"] = viewDistance;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoOptions3d setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoOptions3d setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
