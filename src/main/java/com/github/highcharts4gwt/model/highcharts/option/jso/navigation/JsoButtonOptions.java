
package com.github.highcharts4gwt.model.highcharts.option.jso.navigation;

import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * A collection of options for buttons appearing in the exporting module.
 * 
 */
public class JsoButtonOptions
    extends JavaScriptObject
    implements ButtonOptions
{


    protected JsoButtonOptions() {
    }

    public final native String align()
        throws RuntimeException /*-{
        return this["align"] = (this["align"] || "right");
    }-*/
    ;

    public final native JsoButtonOptions align(String align)
        throws RuntimeException /*-{
        this["align"] = align;
        return this;
    }-*/
    ;

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoButtonOptions enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native double height()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || 20.0);
    }-*/
    ;

    public final native JsoButtonOptions height(double height)
        throws RuntimeException /*-{
        this["height"] = height;
        return this;
    }-*/
    ;

    public final native String symbolFill()
        throws RuntimeException /*-{
        return this["symbolFill"] = (this["symbolFill"] || "#E0E0E0");
    }-*/
    ;

    public final native JsoButtonOptions symbolFill(String symbolFill)
        throws RuntimeException /*-{
        this["symbolFill"] = symbolFill;
        return this;
    }-*/
    ;

    public final native double symbolSize()
        throws RuntimeException /*-{
        return this["symbolSize"] = (this["symbolSize"] || 14.0);
    }-*/
    ;

    public final native JsoButtonOptions symbolSize(double symbolSize)
        throws RuntimeException /*-{
        this["symbolSize"] = symbolSize;
        return this;
    }-*/
    ;

    public final native String symbolStroke()
        throws RuntimeException /*-{
        return this["symbolStroke"] = (this["symbolStroke"] || "#666");
    }-*/
    ;

    public final native JsoButtonOptions symbolStroke(String symbolStroke)
        throws RuntimeException /*-{
        this["symbolStroke"] = symbolStroke;
        return this;
    }-*/
    ;

    public final native double symbolStrokeWidth()
        throws RuntimeException /*-{
        return this["symbolStrokeWidth"] = (this["symbolStrokeWidth"] || 1.0);
    }-*/
    ;

    public final native JsoButtonOptions symbolStrokeWidth(double symbolStrokeWidth)
        throws RuntimeException /*-{
        this["symbolStrokeWidth"] = symbolStrokeWidth;
        return this;
    }-*/
    ;

    public final native double symbolX()
        throws RuntimeException /*-{
        return this["symbolX"] = (this["symbolX"] || 12.5);
    }-*/
    ;

    public final native JsoButtonOptions symbolX(double symbolX)
        throws RuntimeException /*-{
        this["symbolX"] = symbolX;
        return this;
    }-*/
    ;

    public final native double symbolY()
        throws RuntimeException /*-{
        return this["symbolY"] = (this["symbolY"] || 10.5);
    }-*/
    ;

    public final native JsoButtonOptions symbolY(double symbolY)
        throws RuntimeException /*-{
        this["symbolY"] = symbolY;
        return this;
    }-*/
    ;

    public final native String text()
        throws RuntimeException /*-{
        return this["text"] = (this["text"] || "null");
    }-*/
    ;

    public final native JsoButtonOptions text(String text)
        throws RuntimeException /*-{
        this["text"] = text;
        return this;
    }-*/
    ;

    public final native String theme()
        throws RuntimeException /*-{
        this["theme"] = (this["theme"] || JSON.parse(''));
        return JSON.stringify(this["theme"]);
    }-*/
    ;

    public final native JsoButtonOptions theme(String themeAsJsonString)
        throws RuntimeException /*-{
        this["theme"] = JSON.parse(themeAsJsonString);
        return this;
    }-*/
    ;

    public final native String verticalAlign()
        throws RuntimeException /*-{
        return this["verticalAlign"] = (this["verticalAlign"] || "top");
    }-*/
    ;

    public final native JsoButtonOptions verticalAlign(String verticalAlign)
        throws RuntimeException /*-{
        this["verticalAlign"] = verticalAlign;
        return this;
    }-*/
    ;

    public final native double width()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || 24.0);
    }-*/
    ;

    public final native JsoButtonOptions width(double width)
        throws RuntimeException /*-{
        this["width"] = width;
        return this;
    }-*/
    ;

    public final native double y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || 0.0);
    }-*/
    ;

    public final native JsoButtonOptions y(double y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoButtonOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoButtonOptions setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
