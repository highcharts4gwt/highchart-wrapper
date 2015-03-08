
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;


/**
 * The axis labels show the number or category for each tick.
 * 
 */
public interface Labels {


    /**
     * What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
     * 
     */
    String align();

    /**
     * What part of the string the given position is anchored to. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
     * 
     */
    Labels align(String align);

    /**
     * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc.
     * 
     */
    ArrayNumber autoRotation();

    /**
     * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc.
     * 
     */
    Labels autoRotation(ArrayNumber autoRotation);

    /**
     * Polar charts only. The label's pixel distance from the perimeter of the plot area.
     * 
     */
    double distance();

    /**
     * Polar charts only. The label's pixel distance from the perimeter of the plot area.
     * 
     */
    Labels distance(double distance);

    /**
     * Enable or disable the axis labels.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the axis labels.
     * 
     */
    Labels enabled(boolean enabled);

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
     * 
     */
    String format();

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label.
     * 
     */
    Labels format(String format);

    /**
     * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
     * 
     */
    double maxStaggerLines();

    /**
     * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection.
     * 
     */
    Labels maxStaggerLines(double maxStaggerLines);

    /**
     * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
     * 
     */
    String overflow();

    /**
     * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
     * 
     */
    Labels overflow(String overflow);

    /**
     * The pixel padding for axis labels, to ensure white space between them.
     * 
     */
    double padding();

    /**
     * The pixel padding for axis labels, to ensure white space between them.
     * 
     */
    Labels padding(double padding);

    /**
     * Rotation of the labels in degrees.
     * 
     */
    double rotation();

    /**
     * Rotation of the labels in degrees.
     * 
     */
    Labels rotation(double rotation);

    /**
     * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
     * 
     */
    double staggerLines();

    /**
     * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
     * 
     */
    Labels staggerLines(double staggerLines);

    /**
     * <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>
     * 
     * <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
     * 
     */
    double step();

    /**
     * <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>
     * 
     * <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p>
     * 
     */
    Labels step(double step);

    /**
     * CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels.
     * 
     */
    String style();

    /**
     * CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels.
     * 
     */
    Labels style(String styleAsJsonString);

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    boolean useHTML();

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    Labels useHTML(boolean useHTML);

    /**
     * The x position offset of the label relative to the tick position on the axis.
     * 
     */
    double x();

    /**
     * The x position offset of the label relative to the tick position on the axis.
     * 
     */
    Labels x(double x);

    /**
     * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
     * 
     */
    double y();

    /**
     * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
     * 
     */
    Labels y(double y);

    /**
     * The Z index for the axis labels.
     * 
     */
    double zIndex();

    /**
     * The Z index for the axis labels.
     * 
     */
    Labels zIndex(double zIndex);

    String getFieldAsJsonObject(String fieldName);

    Labels setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
