package supinternet.pfe_dutyfree;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.List;


public class CartAdapter extends ArrayAdapter<Cart> {

    //tweets est la liste des models à afficher
    public CartAdapter(Context context, List<Cart> cart) {
        super(context, 0, cart);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_cart,parent, false);
        }

        CartViewHolder viewHolder = (CartViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CartViewHolder();
            viewHolder.productName = (TextView) convertView.findViewById(R.id.productName);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.quantity = (NumberPicker) convertView.findViewById(R.id.quantity);
            viewHolder.quantity.setMinValue(1);
            viewHolder.quantity.setMaxValue(20);
            viewHolder.quantity.setWrapSelectorWheel(false);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Cart cart = getItem(position);
        System.out.println(cart);
        //il ne reste plus qu'à remplir notre vue
        viewHolder.productName.setText(cart.getProductName());
        Float price = Float.parseFloat(cart.getOriginalPrice()) * (float)cart.getQuantity();
        String priceString = String.valueOf(price);
        cart.setPrice(priceString);
        viewHolder.price.setText(cart.getPrice()+"€");
        viewHolder.quantity.setValue(cart.getQuantity());
        final TextView oPrice = viewHolder.price;
        /*viewHolder.quantity.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                Cart cart = getItem(position);
                cart.setQuantity(newVal);
                Float newPrice = Float.parseFloat(cart.getOriginalPrice()) * (float)newVal;
                String newPriceString = String.valueOf(newPrice);
                cart.setPrice(newPriceString);
            }
        });*/

        viewHolder.quantity.setOnScrollListener(new NumberPicker.OnScrollListener() {

            @Override
            public void onScrollStateChange(NumberPicker numberPicker, int scrollState) {
                if (scrollState == NumberPicker.OnScrollListener.SCROLL_STATE_IDLE) {
                    Cart cart = getItem(position);
                    cart.setQuantity(numberPicker.getValue());
                    Float newPrice = Float.parseFloat(cart.getOriginalPrice()) * (float)numberPicker.getValue();
                    String newPriceString = String.valueOf(newPrice);
                    cart.setPrice(newPriceString);
                    oPrice.setText(cart.getPrice()+"€");
                }
            }
        });
        return convertView;
    }

    private class CartViewHolder{
        public TextView productName;
        public TextView price;
        public NumberPicker quantity;
    }
}
