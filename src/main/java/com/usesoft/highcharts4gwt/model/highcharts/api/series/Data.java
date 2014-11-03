
package com.usesoft.highcharts4gwt.model.highcharts.api.series;

import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Events;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Marker;

public interface Data {


    String color();

    Data color(String color);

    String dataLabels();

    Data dataLabels(String dataLabelsAsJsonString);

    String drilldown();

    Data drilldown(String drilldown);

    Events events();

    Data events(Events events);

    String id();

    Data id(String id);

    boolean isIntermediateSum();

    Data isIntermediateSum(boolean isIntermediateSum);

    boolean isSum();

    Data isSum(boolean isSum);

    double legendIndex();

    Data legendIndex(double legendIndex);

    Marker marker();

    Data marker(Marker marker);

    String name();

    Data name(String name);

    boolean sliced();

    Data sliced(boolean sliced);

    double x();

    Data x(double x);

    double y();

    Data y(double y);

}
