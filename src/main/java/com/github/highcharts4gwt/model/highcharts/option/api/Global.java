
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * Global options that don't apply to each chart. These options, like the <code>lang</code>
 * 		options, must be set using the <code>Highcharts.setOptions</code> method.
 * <pre>Highcharts.setOptions({
 * 	global: {
 * 		useUTC: false
 * 	}
 * });</pre>
 * 
 */
public interface Global {


    /**
     * A custom <code>Date</code> class for advanced date handling. For example, <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to handle Jalali dates.
     * 
     */
    String Date();

    /**
     * A custom <code>Date</code> class for advanced date handling. For example, <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to handle Jalali dates.
     * 
     */
    Global Date(String DateAsJsonString);

    /**
     * Path to the pattern image required by VML browsers in order to draw radial gradients.
     * 
     */
    String VMLRadialGradientURL();

    /**
     * Path to the pattern image required by VML browsers in order to draw radial gradients.
     * 
     */
    Global VMLRadialGradientURL(String VMLRadialGradientURL);

    /**
     * The URL to the additional file to lazy load for Android 2.x devices. These devices don't 
     *  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,
     *  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,
     *  you can install canvas-tools.js on your own server and change this option accordingly.
     * 
     */
    String canvasToolsURL();

    /**
     * The URL to the additional file to lazy load for Android 2.x devices. These devices don't 
     *  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,
     *  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,
     *  you can install canvas-tools.js on your own server and change this option accordingly.
     * 
     */
    Global canvasToolsURL(String canvasToolsURL);

    /**
     * The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a> method. Use this to display UTC based data in a predefined time zone.
     * 
     */
    double timezoneOffset();

    /**
     * The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a> method. Use this to display UTC based data in a predefined time zone.
     * 
     */
    Global timezoneOffset(double timezoneOffset);

    /**
     * Whether to use UTC time for axis scaling, tickmark placement and time display in  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
     * 
     */
    boolean useUTC();

    /**
     * Whether to use UTC time for axis scaling, tickmark placement and time display in  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
     * 
     */
    Global useUTC(boolean useUTC);

    String getFieldAsJsonObject(String fieldName);

    Global setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Global setFunctionAsString(String fieldName, String functionAsString);

}
