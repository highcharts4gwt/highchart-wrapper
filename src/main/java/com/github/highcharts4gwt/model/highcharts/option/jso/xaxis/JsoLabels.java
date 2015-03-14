
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Labels;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * The axis labels show the number or category for each tick.
 * 
 */
public class JsoLabels
    extends JavaScriptObject
    implements Labels
{


    protected JsoLabels() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "center");
    }-*/
    ;

    public final native JsoLabels align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native ArrayNumber autoRotation()
        throws RuntimeException /*-{
        return this["autoRotation"] = (this["autoRotation"] || [-45]);
    }-*/
    ;

    public final native JsoLabels autoRotation(ArrayNumber autoRotation)
        throws RuntimeException /*-{
        this["autoRotation"] = autoRotation;
        return this;
    }-*/
    ;

    public final native double distance()
        throws RuntimeException /*-{
        return this["distance"] = (this["distance"] || 15.0);
    }-*/
    ;

    public final native JsoLabels distance(double distance)
        throws RuntimeException /*-{
        this["distance"] = distance;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoLabels enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native String format()
        throws RuntimeException /*-{
        return this["format"] = (this["format"] || "{value}");
    }-*/
    ;

    public final native JsoLabels format(String format)
        throws RuntimeException /*-{
        this["format"] = format;
        return this;
    }-*/
    ;

    public final native double maxStaggerLines()
        throws RuntimeException /*-{
        return this["maxStaggerLines"] = (this["maxStaggerLines"] || 5.0);
    }-*/
    ;

    public final native JsoLabels maxStaggerLines(double maxStaggerLines)
        throws RuntimeException /*-{
        this["maxStaggerLines"] = maxStaggerLines;
        return this;
    }-*/
    ;

    public final native String overflow()
        throws RuntimeException /*-{
        return this["overflow"] = (this["overflow"] || "null");
    }-*/
    ;

    public final native JsoLabels overflow(String overflow)
        throws RuntimeException /*-{
        this["overflow"] = overflow;
        return this;
    }-*/
    ;

    public final native double padding()
        throws RuntimeException /*-{
        return this["padding"] = (this["padding"] || 5.0);
    }-*/
    ;

    public final native JsoLabels padding(double padding)
        throws RuntimeException /*-{
        this["padding"] = padding;
        return this;
    }-*/
    ;

    public final native double rotation()
        throws RuntimeException /*-{
        return this["rotation"] = (this["rotation"] || 0.0);
    }-*/
    ;

    public final native JsoLabels rotation(double rotation)
        throws RuntimeException /*-{
        this["rotation"] = rotation;
        return this;
    }-*/
    ;

    public final native double staggerLines()
        throws RuntimeException /*-{
        return this["staggerLines"] = (this["staggerLines"] || null);
    }-*/
    ;

    public final native JsoLabels staggerLines(double staggerLines)
        throws RuntimeException /*-{
        this["staggerLines"] = staggerLines;
        return this;
    }-*/
    ;

    public final native double step()
        throws RuntimeException /*-{
        return this["step"] = (this["step"] || null);
    }-*/
    ;

    public final native JsoLabels step(double step)
        throws RuntimeException /*-{
        this["step"] = step;
        return this;
    }-*/
    ;

    public final native String style()
        throws RuntimeException /*-{
        this["style"] = (this["style"] || JSON.parse('{"color":"#6D869F","fontWeight":"bold"}'));
        return JSON.stringify(this["style"]);
    }-*/
    ;

    public final native JsoLabels style(String styleAsJsonString)
        throws RuntimeException /*-{
        this["style"] = JSON.parse(styleAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean useHTML()
        throws RuntimeException /*-{
        return this["useHTML"] = (this["useHTML"] || false);
    }-*/
    ;

    public final native JsoLabels useHTML(boolean useHTML)
        throws RuntimeException /*-{
        this["useHTML"] = useHTML;
        return this;
    }-*/
    ;

    public final native double x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || 0.0);
    }-*/
    ;

    public final native JsoLabels x(double x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native JsoLabels y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native double zIndex()
        throws RuntimeException /*-{
        return this["zIndex"] = (this["zIndex"] || 7.0);
    }-*/
    ;

    public final native JsoLabels zIndex(double zIndex)
        throws RuntimeException /*-{
        this["zIndex"] = zIndex;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoLabels setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + valueToBeEvaluated + ')');
        return this;
    }-*/
    ;

}
