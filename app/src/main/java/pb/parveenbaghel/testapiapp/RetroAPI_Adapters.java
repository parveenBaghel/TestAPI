package pb.parveenbaghel.testapiapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pb.parveenbaghel.testapiapp.POJO.UserItems;

public class RetroAPI_Adapters extends RecyclerView.Adapter<RetroAPI_Adapters.RetroViewHolder> {

    private List<UserItems> userItems;
    private Context context;

    RetroAPI_Adapters(Context context, List<UserItems> useritems) {
        this.context = context;
        this.userItems = useritems;
    }

    @NonNull
    @Override
    public RetroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.retrocustomlayout, parent, false);
        return new RetroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RetroViewHolder holder, int position) {

        holder.textView1.setText(userItems.get(position).getTitle());
        holder.textView2.setText(userItems.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return userItems.size();
    }

    public class RetroViewHolder extends RecyclerView.ViewHolder {

        TextView textView1, textView2;

        public RetroViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.title);
            textView2 = itemView.findViewById(R.id.body);

        }
    }
}
