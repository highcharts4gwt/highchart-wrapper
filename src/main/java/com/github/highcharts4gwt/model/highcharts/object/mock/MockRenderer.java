
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Renderer;


/**
 * <p>Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles,paths or text directly on a chart, or independent from any chart. The Renderer represents a wrapper object for SVGin modern browsers and VML in IE &lt; 8.</p><p>An existing chart's renderer can be accessed through <code>chart.renderer</code>. To create a renderer independent from a chart, use <code>var renderer = new Highcharts.Renderer(parentNode, width, height);</code> where parentNode is the HTML element where you want to add it.</p><p>The Renderer's methods are chained wherever possible, so you can initiate an element then call for example <code>attr</code> and <code>css</code> and <code>add</code> on that element in one statement.</p><div class="demo"><a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-on-chart/">Annotating a chart programmatically</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-basic/">independent SVG/VML drawing</a></div>
 * 
 */
public class MockRenderer
    implements Renderer
{


}
