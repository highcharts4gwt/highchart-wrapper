
package com.github.highcharts4gwt.model.highcharts.object.jso;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.</p><p>The X axis or axes are referenced by <code>chart.xAxis</code>, which is an array of Axis objects. If there is only one axis, it can be referenced through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The same pattern goes for Y axes.</p><p>If you need to get the axes from a series object, use the <code>series.xAxis</code> and<code>series.yAxis</code> properties. These are not arrays, as one series can only be associated to one X and one Y axis.</p><p>A third way to reference the axis programmatically is by id. Add an id in the axis configuration options, and get the axis by <code>chart.get(id)</code>.</p> <p>Configuration options for the axes are given in <a class="internal" href="#xAxis">options.xAxis</a> and <a class="internal" href="#yAxis">options.yAxis</a>.</p>
 * 
 */
public class JsoAxis
    extends JavaScriptObject
    implements Axis
{


    protected JsoAxis() {
    }

}
