package sg.edu.rp.c346.id22015127.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        weatherList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvArea = rowView.findViewById(R.id.tvArea);
        TextView tvForecast = rowView.findViewById(R.id.tvForecast);

        Weather detail = weatherList.get(position);

        tvArea.setText("Area: " + detail.getArea());
        tvForecast.setText("Forecast: " + detail.getForecast());

        return rowView;

    }

}
