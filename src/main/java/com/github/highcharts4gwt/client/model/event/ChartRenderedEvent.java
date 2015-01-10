package com.github.highcharts4gwt.client.model.event;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.google.web.bindery.event.shared.Event;

public class ChartRenderedEvent extends Event<ChartRenderedEvent.Handler>
{
    private static Type<ChartRenderedEvent.Handler> TYPE;

    public static Type<ChartRenderedEvent.Handler> getType() {
        if ( TYPE == null )
            TYPE = new Type<ChartRenderedEvent.Handler>();
        return TYPE;
    }
    
    private final Chart chart;
    
    public ChartRenderedEvent(Chart chart)
    {
        this.chart = chart;
    }

    public Chart getChart()
    {
        return chart;
    }

    @Override
    public com.google.web.bindery.event.shared.Event.Type<Handler> getAssociatedType()
    {
        return getType();
    }

    @Override
    protected void dispatch(Handler handler)
    {
        handler.onChartRendered(getChart());
    }
    
    public interface Handler {
        void onChartRendered(Chart chart);
    }
}
