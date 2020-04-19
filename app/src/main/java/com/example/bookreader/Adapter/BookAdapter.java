package com.example.bookreader.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreader.R;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_layout, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public BookViewHolder(@NonNull final View itemView) {
            super(itemView);
           textView=itemView.findViewById(R.id.book_name);
           cardView=itemView.findViewById(R.id.cardview1);
           cardView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast.makeText(itemView.getContext(),"Opening Book",Toast.LENGTH_LONG).show();
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://enos.itcollege.ee/~jpoial/allalaadimised/reading/Android-Programming-Cookbook.pdf"));
                   itemView.getContext().startActivity(browserIntent);
               }
           });
        }

    }


}
