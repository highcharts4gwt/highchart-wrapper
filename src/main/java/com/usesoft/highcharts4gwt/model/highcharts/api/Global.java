
package com.usesoft.highcharts4gwt.model.highcharts.api;


public interface Global {


    String Date();

    Global Date(String DateAsJsonString);

    String VMLRadialGradientURL();

    Global VMLRadialGradientURL(String VMLRadialGradientURL);

    String canvasToolsURL();

    Global canvasToolsURL(String canvasToolsURL);

    double timezoneOffset();

    Global timezoneOffset(double timezoneOffset);

    boolean useUTC();

    Global useUTC(boolean useUTC);

}
