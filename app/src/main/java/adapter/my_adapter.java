package adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.third.Main2Activity;
import com.example.third.R;

import java.util.List;

import model.ListItem;

public class my_adapter extends RecyclerView.Adapter<my_adapter.ViewHolder> {
    private Context context;
    private List<ListItem> listitem;

    public my_adapter(Context context, List listitem) {
        this.context=context;
        this.listitem=listitem;

    }


    @NonNull
    @Override
    public my_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_row,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull my_adapter.ViewHolder holder, int position) {
        ListItem item=listitem.get(position);
holder.name.setText("HELLO");
holder.description.setText("Description");
holder.review.setText("review");
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name;
        public TextView description;
        public TextView review;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.title);
            description=(TextView) itemView.findViewById(R.id.description);
            review=(TextView) itemView.findViewById(R.id.review);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position;
            position=getAdapterPosition();
            ListItem item= listitem.get(position);
            Toast.makeText(context, item.getName(),Toast.LENGTH_LONG).show();
            Intent intent=new Intent(context, Main2Activity.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("description",item.getDescription());
            intent.putExtra("review",item.getReview());
            context.startActivity(intent);


        }
    }
}




