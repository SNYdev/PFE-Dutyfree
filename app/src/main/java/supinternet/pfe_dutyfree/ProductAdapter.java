package supinternet.pfe_dutyfree;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductAdapter extends ArrayAdapter<Product> {
    public ProductAdapter(Context context, List<Product> producte) {
        super(context, 0, producte);
    }
    public List<String> shopSelection = new ArrayList<>();
    public Map<String, String> data = new HashMap<String, String>();

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_product,parent, false);
        }
        final View convertedView = convertView;

        ProductViewHolder viewHolder = (ProductViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new ProductViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.prix = (TextView) convertView.findViewById(R.id.prix);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        final Product product = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(product.getTitle());
        viewHolder.description.setText(product.getDescription());
        viewHolder.prix.setText(product.getPrice());
        Drawable myDrawable = getContext().getResources().getDrawable(product.getColor());
        viewHolder.image.setImageDrawable(myDrawable);
        viewHolder.image.setScaleType(ImageView.ScaleType.FIT_XY);

        convertedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopSelection.add(product.getTitle());
                data.put(product.getTitle(), product.getPrice());
                System.out.println("Product adapter : " + shopSelection);
                convertedView.setBackgroundColor(getContext().getResources().getColor(R.color.colorPrimary));
            }
        });
        return convertView;
    }

    private class ProductViewHolder {
        public TextView title;
        public TextView description;
        public TextView prix;
        public ImageView image;
    }

    public List<String> getShopSelection(){
        return shopSelection;
    }
}
