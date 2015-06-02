
package com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.marker.states;



/**
 * The appearance of the point marker when selected. In order to allow a point to be 
 * 		selected, set the <code>series.allowPointSelect</code> option to true.
 * 
 */
public interface Select {


    /**
     * Enable or disable visible feedback for selection.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable visible feedback for selection.
     * 
     */
    Select enabled(boolean enabled);

    /**
     * The fill color of the point marker.
     * 
     */
    String fillColor();

    /**
     * The fill color of the point marker.
     * 
     */
    Select fillColor(String fillColor);

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    String lineColor();

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    Select lineColor(String lineColor);

    /**
     * The width of the point marker's outline.
     * 
     */
    double lineWidth();

    /**
     * The width of the point marker's outline.
     * 
     */
    Select lineWidth(double lineWidth);

    /**
     * The radius of the point marker. In hover state, it defaults
     * 		to the normal state's radius + 2.
     * 
     */
    double radius();

    /**
     * The radius of the point marker. In hover state, it defaults
     * 		to the normal state's radius + 2.
     * 
     */
    Select radius(double radius);

    String getFieldAsJsonObject(String fieldName);

    Select setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Select setFunctionAsString(String fieldName, String functionAsString);

}
