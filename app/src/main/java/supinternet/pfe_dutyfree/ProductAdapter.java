package supinternet.pfe_dutyfree;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 28/11/2016.
 */

public class ProductAdapter extends ArrayAdapter<Product> {
    public ProductAdapter(Context context, List<Product> producte) {
        super(context, 0, producte);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_product,parent, false);
        }

        ProductViewHolder viewHolder = (ProductViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new ProductViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Product product = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(product.getTitle());
        viewHolder.description.setText(product.getDescription());
        viewHolder.image.setImageDrawable(new ColorDrawable(product.getColor()));
        return convertView;
    }

    private class ProductViewHolder {
        public TextView title;
        public TextView description;
        public ImageView image;
    }
}
