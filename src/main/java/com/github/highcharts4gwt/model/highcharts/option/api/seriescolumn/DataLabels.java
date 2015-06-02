
package com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn;



/**
 * 
 */
public interface DataLabels {


    /**
     * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
     * 
     */
    String align();

    /**
     * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
     * 
     */
    DataLabels align(String align);

    /**
     * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
     * 
     */
    boolean allowOverlap();

    /**
     * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
     * 
     */
    DataLabels allowOverlap(boolean allowOverlap);

    /**
     * The background color or gradient for the data label. Defaults to <code>undefined</code>.
     * 
     */
    String backgroundColor();

    /**
     * The background color or gradient for the data label. Defaults to <code>undefined</code>.
     * 
     */
    DataLabels backgroundColor(String backgroundColor);

    /**
     * The border color for the data label. Defaults to <code>undefined</code>.
     * 
     */
    String borderColor();

    /**
     * The border color for the data label. Defaults to <code>undefined</code>.
     * 
     */
    DataLabels borderColor(String borderColor);

    /**
     * The border radius in pixels for the data label.
     * 
     */
    double borderRadius();

    /**
     * The border radius in pixels for the data label.
     * 
     */
    DataLabels borderRadius(double borderRadius);

    /**
     * The border width in pixels for the data label.
     * 
     */
    double borderWidth();

    /**
     * The border width in pixels for the data label.
     * 
     */
    DataLabels borderWidth(double borderWidth);

    /**
     * The text color for the data labels. Defaults to <code>null</code>.
     * 
     */
    String color();

    /**
     * The text color for the data labels. Defaults to <code>null</code>.
     * 
     */
    DataLabels color(String color);

    /**
     * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
     * 
     */
    boolean crop();

    /**
     * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
     * 
     */
    DataLabels crop(boolean crop);

    /**
     * Whether to defer displaying the data labels until the initial series animation has finished.
     * 
     */
    boolean defer();

    /**
     * Whether to defer displaying the data labels until the initial series animation has finished.
     * 
     */
    DataLabels defer(boolean defer);

    /**
     * Enable or disable the data labels.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the data labels.
     * 
     */
    DataLabels enabled(boolean enabled);

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
     * 
     */
    String format();

    /**
     * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
     * 
     */
    DataLabels format(String format);

    /**
     * For points with an extent, like columns, whether to align the data label inside the box or to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
     * 
     */
    boolean inside();

    /**
     * For points with an extent, like columns, whether to align the data label inside the box or to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
     * 
     */
    DataLabels inside(boolean inside);

    /**
     * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
     * 
     */
    String overflow();

    /**
     * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
     * 
     */
    DataLabels overflow(String overflow);

    /**
     * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
     * 
     */
    double padding();

    /**
     * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
     * 
     */
    DataLabels padding(double padding);

    /**
     * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
     * 
     */
    double rotation();

    /**
     * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
     * 
     */
    DataLabels rotation(double rotation);

    /**
     * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    boolean shadowAsBoolean();

    /**
     * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    DataLabels shadowAsBoolean(boolean shadowAsBoolean);

    /**
     * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    String shadowAsJsonString();

    /**
     * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * 
     */
    DataLabels shadowAsJsonString(String shadowAsJsonString);

    /**
     * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
     * 
     */
    String shape();

    /**
     * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
     * 
     */
    DataLabels shape(String shape);

    /**
     * Styles for the label.
     * 
     */
    String style();

    /**
     * Styles for the label.
     * 
     */
    DataLabels style(String styleAsJsonString);

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    boolean useHTML();

    /**
     * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
     * 
     */
    DataLabels useHTML(boolean useHTML);

    /**
     * The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance in a column chart, the label is above positive values and below negative values.
     * 
     */
    String verticalAlign();

    /**
     * The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance in a column chart, the label is above positive values and below negative values.
     * 
     */
    DataLabels verticalAlign(String verticalAlign);

    /**
     * The x position offset of the label relative to the point.
     * 
     */
    double x();

    /**
     * The x position offset of the label relative to the point.
     * 
     */
    DataLabels x(double x);

    /**
     * The y position offset of the label relative to the point.
     * 
     */
    double y();

    /**
     * The y position offset of the label relative to the point.
     * 
     */
    DataLabels y(double y);

    /**
     * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
     * 
     */
    double zIndex();

    /**
     * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
     * 
     */
    DataLabels zIndex(double zIndex);

    String getFieldAsJsonObject(String fieldName);

    DataLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    DataLabels setFunctionAsString(String fieldName, String functionAsString);

}
