
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * The chart's subtitle
 * 
 */
public interface Subtitle {


    /**
     * The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
     * 
     */
    String align();

    /**
     * The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
     * 
     */
    Subtitle align(String align);

    /**
     * When the subtitle is floating, the plot area will not move to make space for it.
     * 
     */
    boolean floating();

    /**
     * When the subtitle is floating, the plot area will not move to make space for it.
     * 
     */
    Subtitle floating(boolean floating);

    /**
     * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
     * 
     */
    String style();

    /**
     * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
     * 
     */
    Subtitle style(String styleAsJsonString);

    /**
     * The subtitle of the chart.
     * 
     */
    String text();

    /**
     * The subtitle of the chart.
     * 
     */
    Subtitle text(String text);

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
     * 
     */
    boolean useHTML();

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
     * 
     */
    Subtitle useHTML(boolean useHTML);

    /**
     * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
     * 
     */
    Subtitle verticalAlign(String verticalAlign);

    /**
     * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
     * 
     */
    double x();

    /**
     * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
     * 
     */
    Subtitle x(double x);

    /**
     * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
     * 
     */
    double y();

    /**
     * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
     * 
     */
    Subtitle y(double y);

    String getFieldAsJsonObject(String fieldName);

    Subtitle setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
