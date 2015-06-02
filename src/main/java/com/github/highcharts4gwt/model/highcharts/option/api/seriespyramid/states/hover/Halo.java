
package com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.states.hover;



/**
 * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
 * 
 */
public interface Halo {


    /**
     * A collection of SVG attributes to override the appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
     * 
     */
    String attributes();

    /**
     * A collection of SVG attributes to override the appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
     * 
     */
    Halo attributes(String attributesAsJsonString);

    /**
     * Opacity for the halo unless a specific fill is overridden using the <code>attributes</code> setting. Note that Highcharts is only able to apply opacity to colors of hex or rgb(a) formats.
     * 
     */
    double opacity();

    /**
     * Opacity for the halo unless a specific fill is overridden using the <code>attributes</code> setting. Note that Highcharts is only able to apply opacity to colors of hex or rgb(a) formats.
     * 
     */
    Halo opacity(double opacity);

    /**
     * The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
     * 
     */
    double size();

    /**
     * The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
     * 
     */
    Halo size(double size);

    String getFieldAsJsonObject(String fieldName);

    Halo setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Halo setFunctionAsString(String fieldName, String functionAsString);

}
