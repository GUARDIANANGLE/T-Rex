package cz.tmapy.android.trex.layout;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import cz.tmapy.android.trex.R;

/**
 * Adapter for track list row
 * Created by kasvo on 16.9.2015.
 */
public class TrackDataCursorAdapter extends CursorAdapter {
    private LayoutInflater mInflater;

    public TrackDataCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView headerView = (TextView) view.findViewById(R.id.text_tracks_list_item_header);

        headerView.setText(new SimpleDateFormat("d.M. H:mm").format(cursor.getLong(1)) + "-" + new SimpleDateFormat("H:mm").format(cursor.getLong(5)) +
                "  " + String.format("%.2f", (cursor.getFloat(9) / 1000)) + "km");

        TextView descView = (TextView) view.findViewById(R.id.text_tracks_list_item_description);
        descView.setText(R.string.textview_track_row_desc_speed + String.format("%.0f", (cursor.getFloat(10) / 1000) * 3600) + "/" + String.format("%.0f", (cursor.getFloat(11) / 1000) * 3600) +
                "  " + R.string.textview_track_row_desc_alt + String.format("%.0f", cursor.getDouble(12)) + "/" + String.format("%.0f", cursor.getDouble(13)) + "/" +
                String.format("%.0f", cursor.getDouble(14)) + "/" + String.format("%.0f", cursor.getDouble(15)));
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return mInflater.inflate(R.layout.tracks_listview_row, parent, false);
    }
}