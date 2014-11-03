
package com.usesoft.highcharts4gwt.model.highcharts.api.chart;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.Frame;

public interface Options3d {


    double alpha();

    Options3d alpha(double alpha);

    double beta();

    Options3d beta(double beta);

    double depth();

    Options3d depth(double depth);

    boolean enabled();

    Options3d enabled(boolean enabled);

    Frame frame();

    Options3d frame(Frame frame);

    double viewDistance();

    Options3d viewDistance(double viewDistance);

}
