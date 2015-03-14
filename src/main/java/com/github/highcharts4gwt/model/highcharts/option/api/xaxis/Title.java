
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;



/**
 * The axis title, showing next to the axis line.
 * 
 */
public interface Title {


    /**
     * Alignment of the title relative to the axis values. Possible values
     *  are "low", "middle" or "high".
     * 
     */
    String align();

    /**
     * Alignment of the title relative to the axis values. Possible values
     *  are "low", "middle" or "high".
     * 
     */
    Title align(String align);

    /**
     * Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
     * 
     */
    String enabled();

    /**
     * Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
     * 
     */
    Title enabled(String enabled);

    /**
     * The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
     * 
     */
    double margin();

    /**
     * The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
     * 
     */
    Title margin(double margin);

    /**
     * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
     * 
     */
    double offset();

    /**
     * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
     * 
     */
    Title offset(double offset);

    /**
     * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
     * 
     */
    double rotation();

    /**
     * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
     * 
     */
    Title rotation(double rotation);

    /**
     * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
     * 
     */
    String style();

    /**
     * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
     * 
     */
    Title style(String styleAsJsonString);

    /**
     * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
     * 
     */
    String text();

    /**
     * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
     * 
     */
    Title text(String text);

    String getFieldAsJsonObject(String fieldName);

    Title setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Title setFunctionAsString(String fieldName, String functionAsString);

}
