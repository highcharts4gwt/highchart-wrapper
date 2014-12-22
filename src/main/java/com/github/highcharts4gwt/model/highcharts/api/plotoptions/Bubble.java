
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Scatter;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowHandler;

public interface Bubble
    extends Scatter
{


    boolean displayNegative();

    Bubble displayNegative(boolean displayNegative);

    void addBubbleAfterAnimateHandler(BubbleAfterAnimateHandler bubbleAfterAnimateHandler);

    void addBubbleCheckboxClickHandler(BubbleCheckboxClickHandler bubbleCheckboxClickHandler);

    void addBubbleClickHandler(BubbleClickHandler bubbleClickHandler);

    void addBubbleHideHandler(BubbleHideHandler bubbleHideHandler);

    void addBubbleLegendItemClickHandler(BubbleLegendItemClickHandler bubbleLegendItemClickHandler);

    void addBubbleMouseOutHandler(BubbleMouseOutHandler bubbleMouseOutHandler);

    void addBubbleMouseOverHandler(BubbleMouseOverHandler bubbleMouseOverHandler);

    void addBubbleShowHandler(BubbleShowHandler bubbleShowHandler);

    String maxSize();

    Bubble maxSize(String maxSize);

    String minSize();

    Bubble minSize(String minSize);

    String sizeBy();

    Bubble sizeBy(String sizeBy);

    double zMax();

    Bubble zMax(double zMax);

    double zMin();

    Bubble zMin(double zMin);

    double zThreshold();

    Bubble zThreshold(double zThreshold);

}
