
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;


/**
 * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
 * 
 */
public interface Exporting {


    /**
     * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
     * 
     */
    Buttons buttons();

    /**
     * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
     * 
     */
    Exporting buttons(Buttons buttons);

    /**
     * Additional chart options to be merged into an exported chart. For example, the exported chart can be given a specific width and height, or a printer-friendly color scheme.
     * 
     */
    String chartOptions();

    /**
     * Additional chart options to be merged into an exported chart. For example, the exported chart can be given a specific width and height, or a printer-friendly color scheme.
     * 
     */
    Exporting chartOptions(String chartOptionsAsJsonString);

    /**
     * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
     * 
     */
    boolean enabled();

    /**
     * Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available.
     * 
     */
    Exporting enabled(boolean enabled);

    /**
     * The filename, without extension, to use for the exported chart.
     * 
     */
    String filename();

    /**
     * The filename, without extension, to use for the exported chart.
     * 
     */
    Exporting filename(String filename);

    /**
     * An object containing additional attributes for the POST form that sends the SVG to the export server. For example, a <code>target</code> can be set to make sure the generated image is received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be set.
     * 
     */
    String formAttributes();

    /**
     * An object containing additional attributes for the POST form that sends the SVG to the export server. For example, a <code>target</code> can be set to make sure the generated image is received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be set.
     * 
     */
    Exporting formAttributes(String formAttributesAsJsonString);

    /**
     * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG.
     * 
     */
    double scale();

    /**
     * Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The default scale of 2 makes this chart export to a 1200px PNG or JPG.
     * 
     */
    Exporting scale(double scale);

    /**
     * Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
     * 
     */
    double sourceHeight();

    /**
     * Analogous to <a href="#exporting.sourceWidth">sourceWidth</a>
     * 
     */
    Exporting sourceHeight(double sourceHeight);

    /**
     * The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
     * 
     */
    double sourceWidth();

    /**
     * The width of the original chart when exported, unless an explicit <a href="#chart.width">chart.width</a> is set. The width exported raster image is then multiplied by <a href="#exporting.scale">scale</a>.
     * 
     */
    Exporting sourceWidth(double sourceWidth);

    /**
     * Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
     * 
     */
    String type();

    /**
     * Default MIME type for exporting if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option. Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and <code>image/svg+xml</code>.
     * 
     */
    Exporting type(String type);

    /**
     * The URL for the server module converting the SVG string to an image format. By default this points to Highslide Software's free web service.
     * 
     */
    String url();

    /**
     * The URL for the server module converting the SVG string to an image format. By default this points to Highslide Software's free web service.
     * 
     */
    Exporting url(String url);

    /**
     * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
     * 
     */
    double width();

    /**
     * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is a function of the <a href="#chart.width">chart.width</a> or <a href="#exporting.sourceWidth">exporting.sourceWidth</a> and the <a href="#exporting.scale">exporting.scale</a>.
     * 
     */
    Exporting width(double width);

    String getFieldAsJsonObject(String fieldName);

    Exporting setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
