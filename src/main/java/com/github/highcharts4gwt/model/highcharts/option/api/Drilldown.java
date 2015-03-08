
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;


/**
 * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
 * 
 * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
 * 
 */
public interface Drilldown {


    /**
     * Additional styles to apply to the X axis label for a point that has drilldown data. By default it is underlined and blue to invite to interaction. Defaults to:
     * <pre>activeAxisLabelStyle: {
     * 	cursor: 'pointer',
     * 	color: '#0d233a',
     * 	fontWeight: 'bold',
     * 	textDecoration: 'underline'			
     * }</pre>
     * 
     */
    String activeAxisLabelStyle();

    /**
     * Additional styles to apply to the X axis label for a point that has drilldown data. By default it is underlined and blue to invite to interaction. Defaults to:
     * <pre>activeAxisLabelStyle: {
     * 	cursor: 'pointer',
     * 	color: '#0d233a',
     * 	fontWeight: 'bold',
     * 	textDecoration: 'underline'			
     * }</pre>
     * 
     */
    Drilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString);

    /**
     * Additional styles to apply to the data label of a point that has drilldown data. By default it is underlined and blue to invite to interaction. Defaults to:
     * <pre>activeAxisLabelStyle: {
     * 	cursor: 'pointer',
     * 	color: '#0d233a',
     * 	fontWeight: 'bold',
     * 	textDecoration: 'underline'			
     * }</pre>
     * 
     */
    String activeDataLabelStyle();

    /**
     * Additional styles to apply to the data label of a point that has drilldown data. By default it is underlined and blue to invite to interaction. Defaults to:
     * <pre>activeAxisLabelStyle: {
     * 	cursor: 'pointer',
     * 	color: '#0d233a',
     * 	fontWeight: 'bold',
     * 	textDecoration: 'underline'			
     * }</pre>
     * 
     */
    Drilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString);

    /**
     * <p>Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and points of different types, but animation will not occur.</p>
     *  
     *  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,
     *  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,
     *  the following properties are supported: 
     *  </p><dl>
     *  	<dt>duration</dt>
     *  	<dd>The duration of the animation in milliseconds.</dd>
     *  	
     *  	<dt>easing</dt>
     *  	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or
     *  	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably
     *  	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using 
     *  	MooTools as the general framework, use the property name <code>transition</code> instead 
     *  	of <code>easing</code>.</dd>
     *  </dl>
     * 
     */
    boolean animationAsBoolean();

    /**
     * <p>Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and points of different types, but animation will not occur.</p>
     *  
     *  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,
     *  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,
     *  the following properties are supported: 
     *  </p><dl>
     *  	<dt>duration</dt>
     *  	<dd>The duration of the animation in milliseconds.</dd>
     *  	
     *  	<dt>easing</dt>
     *  	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or
     *  	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably
     *  	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using 
     *  	MooTools as the general framework, use the property name <code>transition</code> instead 
     *  	of <code>easing</code>.</dd>
     *  </dl>
     * 
     */
    Drilldown animationAsBoolean(boolean animationAsBoolean);

    /**
     * <p>Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and points of different types, but animation will not occur.</p>
     *  
     *  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,
     *  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,
     *  the following properties are supported: 
     *  </p><dl>
     *  	<dt>duration</dt>
     *  	<dd>The duration of the animation in milliseconds.</dd>
     *  	
     *  	<dt>easing</dt>
     *  	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or
     *  	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably
     *  	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using 
     *  	MooTools as the general framework, use the property name <code>transition</code> instead 
     *  	of <code>easing</code>.</dd>
     *  </dl>
     * 
     */
    String animationAsJsonString();

    /**
     * <p>Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and points of different types, but animation will not occur.</p>
     *  
     *  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,
     *  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,
     *  the following properties are supported: 
     *  </p><dl>
     *  	<dt>duration</dt>
     *  	<dd>The duration of the animation in milliseconds.</dd>
     *  	
     *  	<dt>easing</dt>
     *  	<dd>When using jQuery as the general framework, the easing can be set to <code>linear</code> or
     *  	<code>swing</code>. More easing functions are available with the use of jQuery plug-ins, most notably
     *  	the jQuery UI suite. See <a href="http://api.jquery.com/animate/">the jQuery docs</a>. When using 
     *  	MooTools as the general framework, use the property name <code>transition</code> instead 
     *  	of <code>easing</code>.</dd>
     *  </dl>
     * 
     */
    Drilldown animationAsJsonString(String animationAsJsonString);

    /**
     * Options for the drill up button that appears when drilling down on a series. The text for the button is defined in <a href="#lang.drillUpText">lang.drillUpText</a>.
     * 
     */
    DrillUpButton drillUpButton();

    /**
     * Options for the drill up button that appears when drilling down on a series. The text for the button is defined in <a href="#lang.drillUpText">lang.drillUpText</a>.
     * 
     */
    Drilldown drillUpButton(DrillUpButton drillUpButton);

    String getFieldAsJsonObject(String fieldName);

    Drilldown setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
