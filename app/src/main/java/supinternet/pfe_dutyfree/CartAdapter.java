package supinternet.pfe_dutyfree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 01/12/2016.
 */

public class CartAdapter extends ArrayAdapter<Cart> {
    NumberPicker np;

    //tweets est la liste des models à afficher
    public CartAdapter(Context context, List<Cart> cart) {
        super(context, 0, cart);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_cart,parent, false);
        }

        CartViewHolder viewHolder = (CartViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CartViewHolder();
            viewHolder.productName = (TextView) convertView.findViewById(R.id.productName);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.quantity = (NumberPicker) convertView.findViewById(R.id.quantity);
            viewHolder.quantity.setMaxValue(20);
            viewHolder.quantity.setMinValue(1);
            viewHolder.quantity.setWrapSelectorWheel(false);
            np = viewHolder.quantity;
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Cart cart = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.productName.setText(cart.getProductName());
        viewHolder.price.setText(cart.getPrice());
        viewHolder.quantity.setValue(cart.getQuantity());

        return convertView;
    }

    private class CartViewHolder{
        public TextView productName;
        public TextView price;
        public NumberPicker quantity;
    }
}
