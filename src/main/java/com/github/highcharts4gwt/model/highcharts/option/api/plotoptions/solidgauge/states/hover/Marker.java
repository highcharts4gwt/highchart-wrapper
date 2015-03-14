
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.states.hover;



/**
 * 
 */
public interface Marker {


    /**
     * Enable or disable the point marker.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the point marker.
     * 
     */
    Marker enabled(boolean enabled);

    /**
     * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
     * 
     */
    String fillColor();

    /**
     * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
     * 
     */
    Marker fillColor(String fillColor);

    /**
     * Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
     * 
     */
    double height();

    /**
     * Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
     * 
     */
    Marker height(double height);

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    String lineColor();

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    Marker lineColor(String lineColor);

    /**
     * The width of the point marker's outline.
     * 
     */
    double lineWidth();

    /**
     * The width of the point marker's outline.
     * 
     */
    Marker lineWidth(double lineWidth);

    /**
     * The radius of the point marker.
     * 
     */
    double radius();

    /**
     * The radius of the point marker.
     * 
     */
    Marker radius(double radius);

    /**
     * <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>
     * 
     * <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>
     * 
     * <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
     * 
     */
    String symbol();

    /**
     * <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>
     * 
     * <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>
     * 
     * <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
     * 
     */
    Marker symbol(String symbol);

    /**
     * Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
     * 
     */
    double width();

    /**
     * Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
     * 
     */
    Marker width(double width);

    String getFieldAsJsonObject(String fieldName);

    Marker setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Marker setFunctionAsString(String fieldName, String functionAsString);

}
